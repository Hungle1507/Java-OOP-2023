package lession_06;

//Template | Blueprint
public class MayGatDapLienHop {
    // What to solve

    public void gatLua(String cayLua){
        System.out.println(cayLua);
    }
    public void xayLua (String hatLua){
        System.out.println(hatLua);
    }

    public static void main(String[] args) {
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
        // dấu . gọi là dot notation
        mayGatDapLienHop.gatLua("cay lua");
        mayGatDapLienHop.xayLua("hat lua");
    }
}
