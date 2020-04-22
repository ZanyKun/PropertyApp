package acres.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Scope("session")
@Component
public class UserInfo {
	

	@Id
	String username;
	String password1;
	String name;
	String email;
	String phoneNum;
	String userType;					//Owner, Dealer
	
	@OneToMany(mappedBy = "user")
	List<BuildingInfo> buildingList;	//List of building listings
	
	public UserInfo(String username2, String password1, String name2, String email2, String phoneNum2) {
		this.username = username2;
		this.password1 = password1;
		this.name = name2;
		this.email = email2;
		this.phoneNum = phoneNum2;
	}
	
}
