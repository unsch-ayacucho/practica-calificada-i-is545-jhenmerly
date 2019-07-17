package edu.pe.unsch.entities;
// Generated 16/07/2019 11:31:21 PM by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name = "producto", catalog = "ecommerceremate")
public class Producto implements java.io.Serializable {

	private Integer id;
	private Categoria categoria;
	private Marca marca;
	private String nombre;
	private BigDecimal precio;
	private BigDecimal precionuevo;
	private Integer stock;
	private Boolean nuevo;
	private Boolean recomendado;
	private String descripcion;
	private Boolean visible;
	private String urlimagen;
	private Set<Imagen> imagens = new HashSet<Imagen>(0);
	private Set<Revision> revisions = new HashSet<Revision>(0);

	public Producto() {
	}

	public Producto(String urlimagen) {
		this.urlimagen = urlimagen;
	}

	public Producto(Categoria categoria, Marca marca, String nombre, BigDecimal precio, BigDecimal precionuevo,
			Integer stock, Boolean nuevo, Boolean recomendado, String descripcion, Boolean visible, String urlimagen,
			Set<Imagen> imagens, Set<Revision> revisions) {
		this.categoria = categoria;
		this.marca = marca;
		this.nombre = nombre;
		this.precio = precio;
		this.precionuevo = precionuevo;
		this.stock = stock;
		this.nuevo = nuevo;
		this.recomendado = recomendado;
		this.descripcion = descripcion;
		this.visible = visible;
		this.urlimagen = urlimagen;
		this.imagens = imagens;
		this.revisions = revisions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcategoria")
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idmarca")
	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@Column(name = "nombre", length = 40)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "precio", precision = 7)
	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Column(name = "precionuevo", precision = 7)
	public BigDecimal getPrecionuevo() {
		return this.precionuevo;
	}

	public void setPrecionuevo(BigDecimal precionuevo) {
		this.precionuevo = precionuevo;
	}

	@Column(name = "stock")
	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Column(name = "nuevo")
	public Boolean getNuevo() {
		return this.nuevo;
	}

	public void setNuevo(Boolean nuevo) {
		this.nuevo = nuevo;
	}

	@Column(name = "recomendado")
	public Boolean getRecomendado() {
		return this.recomendado;
	}

	public void setRecomendado(Boolean recomendado) {
		this.recomendado = recomendado;
	}

	@Column(name = "descripcion", length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "visible")
	public Boolean getVisible() {
		return this.visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	@Column(name = "urlimagen", nullable = false, length = 30)
	public String getUrlimagen() {
		return this.urlimagen;
	}

	public void setUrlimagen(String urlimagen) {
		this.urlimagen = urlimagen;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<Imagen> getImagens() {
		return this.imagens;
	}

	public void setImagens(Set<Imagen> imagens) {
		this.imagens = imagens;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<Revision> getRevisions() {
		return this.revisions;
	}

	public void setRevisions(Set<Revision> revisions) {
		this.revisions = revisions;
	}

}