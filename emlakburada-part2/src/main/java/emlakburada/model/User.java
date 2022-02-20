package emlakburada.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import emlakburada.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private UserType userType; // bireysel & kurumsal & yeniTip
	private String name;
	private String email;
<<<<<<< HEAD
	private int userId;
	private String fotograf;
	private String biyografi;
	private Set<Advert> favoriIlanlar = new HashSet<>();
	private List<Advert> yayinladigiIlanlar = new ArrayList<>();
	private List<Message> mesajKutusu;

	public User(String kullaniciTipi, String isim, String email,int userId) {
=======
	private String photo;
	private String bio;
//	private Set<Advert> favoriIlanlar = new HashSet<>();
//	private List<Advert> yayinladigiIlanlar = new ArrayList<>();
//	private List<Message> mesajKutusu;

	public User(UserType userType, String name, String email) {
>>>>>>> eb08587e28ef0358fe7e516187441f704548560d
		super();
		this.userType = userType;
		this.name = name;
		this.email = email;
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
