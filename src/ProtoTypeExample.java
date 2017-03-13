import java.util.ArrayList;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class ProtoTypeExample {


    private static class ShallowWordDocument implements Cloneable {

        public String title;
        public ArrayList<String> imageList;

        public ShallowWordDocument() {
            System.out.println("ShallowWordDocument 执行构造函数 ");
        }

        @Override
        protected Object clone() {
            try {
                ShallowWordDocument document = (ShallowWordDocument) super.clone();
                document.title = this.title;
                document.imageList = this.imageList;
                return document;
            } catch (Exception e) {

            }
            return null;
        }

        public void printDocument() {

            System.out.println("-------------  printDocument start -----------");
            System.out.println("标题 :" + title);

            for (String str : imageList) {
                System.out.println("图片 :" + str);
            }
            System.out.println("-------------  printDocument end -----------");
        }

    }


    private static class DeepWordDocument implements Cloneable {

        public String title;
        public ArrayList<String> imageList;

        public DeepWordDocument() {
            System.out.println("DeepWordDocument 执行构造函数 ");
        }

        @Override
        protected Object clone() {
            try {
                DeepWordDocument document = (DeepWordDocument) super.clone();
                document.title = this.title;
                document.imageList = (ArrayList<String>) this.imageList.clone();
                return document;
            } catch (Exception e) {

            }
            return null;
        }

        public void printDocument() {

            System.out.println("-------------  printDocument start -----------");
            System.out.println("标题 :" + title);

            for (String str : imageList) {
                System.out.println("图片 :" + str);
            }
            System.out.println("-------------  printDocument end -----------");
        }

    }


    public static void main(String args[]) {

        ShallowWordDocument orginDoc = new ShallowWordDocument();
        orginDoc.title = "原始文档";
        orginDoc.imageList = new ArrayList<>();
        orginDoc.imageList.add("图片1");
        orginDoc.imageList.add("图片2");


        ShallowWordDocument copyDoc = (ShallowWordDocument) orginDoc.clone();;
        copyDoc.title = "拷贝文档";
        copyDoc.imageList.add("图片3");


        //浅拷贝
        orginDoc.printDocument();
        copyDoc.printDocument();

        DeepWordDocument orginDoc2 = new DeepWordDocument();
        orginDoc2.title = "原始文档";
        orginDoc2.imageList = new ArrayList<>();
        orginDoc2.imageList.add("图片1");
        orginDoc2.imageList.add("图片2");


        DeepWordDocument copyDoc2 = (DeepWordDocument) orginDoc2.clone();;
        copyDoc2.title = "拷贝文档";
        copyDoc2.imageList.add("图片3");


        //深拷贝
        orginDoc2.printDocument();
        copyDoc2.printDocument();



    }


}
