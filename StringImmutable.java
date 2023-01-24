public class StringImmutable {
    public static void main(String[] args) {
        // String type = "shoes";
        // String SQL = "select * from products where type="+type;
        // double price = 3000;
        // SQL = SQL + " and price>="+price;
        // double rating = 4.0;
        // SQL = SQL + " and rating >="+rating;

        String type = "shoes";
        //StringBuffer SQL = new StringBuffer(); // 16 Capacity
        StringBuilder SQL = new StringBuilder();
        //StringBuffer SQL = new StringBuffer("select * from products where type="+type); // Len + 16 
        System.out.println("Len "+SQL.length());
        System.out.println("Cap "+ SQL.capacity());
        // double price = 3000;
        //SQL.append(" and price >=").append(price);
        synchronized(SQL){
        SQL.append("hgfgkhfdgkhfdgkjhdfjghdfhgkjdfhgjkhdfjkghkjdfhgkjkjhgjkfdhghdfhgjkdfhghdfghkjdfggfdgfdgfdgfd");
        }
        
        //  double rating = 4.0;
        //  SQL.append( " and rating >=").append(rating);

        System.out.println("Len "+SQL.length());
        System.out.println("Cap "+ SQL.capacity());
    }
}
