public class Book
{
	private String title;
	private String author;
	private String subject;

	public Book(String title, String author, String subject)
	{
            this.title=title;
    		 this.author=author;
    		 this.subject=subject;
	}

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}

	public String getSubject()
	{
		return subject;
	}
	@Override
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		sb.append("{--- Book Details----");
		sb.append("Title:"+getTitle());
		sb.append(",");
		sb.append("Author"+getAuthor());
		sb.append(",");
		sb.append("Subject"+getSubject());
		sb.append(".}\n");
		return sb.toString();
	}
}
