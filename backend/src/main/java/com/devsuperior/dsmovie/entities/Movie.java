package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_movie")
public class Movie
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String Image;

	public Movie()
	{

	}

	// General constructor:
	public Movie(Long id, String tile, Double score, Integer count, String image)
	{
		super();
		this.id = id;
		this.title = tile;
		this.score = score;
		this.count = count;
		Image = image;
	}

	// Access methods:
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getTile()
	{
		return title;
	}

	public void setTile(String tile)
	{
		this.title = tile;
	}

	public Double getScore()
	{
		return score;
	}

	public void setScore(Double score)
	{
		this.score = score;
	}

	public Integer getCount()
	{
		return count;
	}

	public void setCount(Integer count)
	{
		this.count = count;
	}

	public String getImage()
	{
		return Image;
	}

	public void setImage(String image)
	{
		Image = image;
	}

}
