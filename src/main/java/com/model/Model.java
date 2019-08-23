package com.model;


public class Model {
	private String movieName;
	private String directorName;
	private String mainactorName;
	private String filmlength;
	private String introduction;
	private String posterUrl;
	private String Crawltime;

	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}



	public String getFilmlength() {
		return filmlength;
	}

	public void setFilmlength(String filmlength) {
		this.filmlength = filmlength;
	}

	public String getMainactorName() {
		return mainactorName;
	}

	public void setMainactorName(String mainactorName) {
		this.mainactorName = mainactorName;
	}


	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
}
