package by.htp.katokoleg.simpleclassandobject.task9;

public class Book {

	private int id;
	private String title;
	private String authors;
	private String publishingHouse;
	private int yearPublished;
	private int numberOfPages;
	private double cost;
	private String typeOfBinding;

	public Book() {

	}

	public Book(int id, String title, String authors, String publishingHouse, int yearPublished, int numberOfPages,
			double cost, String typeOfBinding) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.yearPublished = yearPublished;
		this.numberOfPages = numberOfPages;
		this.cost = cost;
		this.typeOfBinding = typeOfBinding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getTypeOfBinding() {
		return typeOfBinding;
	}

	public void setTypeOfBinding(String typeOfBinding) {
		this.typeOfBinding = typeOfBinding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + numberOfPages;
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((typeOfBinding == null) ? 0 : typeOfBinding.hashCode());
		result = prime * result + yearPublished;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (typeOfBinding == null) {
			if (other.typeOfBinding != null)
				return false;
		} else if (!typeOfBinding.equals(other.typeOfBinding))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [id=" + id + ", title=" + title + ", authors=" + authors + ", publishingHouse=" + publishingHouse
				+ ", yearPublished=" + yearPublished + ", numberOfPages=" + numberOfPages + ", cost=" + cost
				+ ", typeOfBinding=" + typeOfBinding + "]";
	}

	
}
