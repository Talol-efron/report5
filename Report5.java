class Report5{
    public static void main(String[] args) {
        String str = null;    
        try {
            System.out.println("受け取った文字列は" + str + "です。");
            System.out.println("文字列の長さは" + str.length() + "です。");
        } catch (NullPointerException e) {
            //TODO: handle exception
            System.out.println("例外が発生しました。");
            System.out.println(e.getMessage());
        }
    }
}