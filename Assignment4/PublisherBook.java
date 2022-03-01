class Publisher
{
int p_id;
String p_name;
Publisher(int p_id, String p_name)
{
this.p_id = p_id; this.p_name = p_name;
}
void display()
{
System.out.println("Displaying the details:\nPublisher ID "+p_id+"\nName: "+p_name);
}
}
class Book extends Publisher
{
String authorname, bookname;
Book(int p_id, String p_name , String authorname, String bookname)
{
super(p_id, p_name); this.authorname = authorname; this.bookname = bookname;
}
void display()
{
super.display();
System.out.print("Displaying the details of author\nNAME: "+authorname+"\nBookname: "+bookname);
}
}
class Category extends Book
{
int category_code;
Category(int p_id, String p_name , String authorname, String bookname,int category_code)
{
super(p_id,p_name,authorname,bookname); this.category_code = category_code;
}
void display()
{
super.display();
System.out.print(" \nCategory: "+category_code);
}
}
class PublisherBook
{
public static void main(String[] args)
{
Category c = new Category(1, "chetan bhagat","Rohit Kumar Sinha","Harry potter",3); c.display();
}
}