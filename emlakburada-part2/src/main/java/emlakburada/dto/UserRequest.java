package emlakburada.dto;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import emlakburada.model.Advert;
import emlakburada.model.Message;
import lombok.Data;

@Data
public class UserRequest {
	
	private String kullaniciTipi; // bireysel & kurumsal & yeniTip
	private String isim;
	private String email;
	private int id;
	private String fotograf;
	private String biyografi;
	private Set<Advert> favoriIlanlar = new HashSet<>();
	private List<Advert> yayinladigiIlanlar = new ArrayList<>();
	private List<Message> mesajKutusu;

=======
import emlakburada.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

	private UserType userType;
	private String name;
	private String email;
	private String photo;
	private String bio;
>>>>>>> eb08587e28ef0358fe7e516187441f704548560d

}
