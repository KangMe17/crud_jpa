package webct2.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Videos")

@NamedQuery(name = "Video.findAll", query = "SELECT v FROM Video v")

public class Video implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id

	@Column(name = "VideoId")

	private String videoId;

	@Column(name = "Active")

	private int active;

	@Column(name = "Description")

	private String description;

	@Column(name = "Poster")

	private String poster;

	@Column(name = "Title")

	private String title;

	@Column(name = "Views")

	private int views;
	// bi-directional many-to-one association to Category

	@ManyToOne

	@JoinColumn(name = "CategoryId")

	private Category category;

	public Category getCategory() {

		return this.category;

	}

	public void setCategory(Category category) {

		this.category = category;

	}

}
