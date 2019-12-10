package io.agilerules.movieinfoservice.models;

public class Movie {
    private String movieId;
    private String name;
    private String description;
    private String containerMetaDataServiceInfo;

    public Movie(String movieId, String name, String description,  String containerMetaDataServiceInfo) {
        this.movieId = movieId;
        this.name = name;
        this.description = description;
        this.containerMetaDataServiceInfo = containerMetaDataServiceInfo;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public String getContainerMetaDataServiceInfo() {
		return containerMetaDataServiceInfo;
	}

	public void setContainerMetaDataServiceInfo(String containerMetaDataServiceInfo) {
		this.containerMetaDataServiceInfo = containerMetaDataServiceInfo;
	}
    
}
