package emlakcepte.service;

import java.util.List;

import emlakcepte.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakcepte.dao.RealtyDao;

@Service
public class RealtyService {
	
	private RealtyDao realtyDao = new RealtyDao();
	
	@Autowired //injection
	private UserService userService;
	
	public void createRealty(Realty realty) {	
		
		//userService.printAllUser();
		
		if (UserType.INDIVIDUAL.equals(realty.getUser().getType()) ) {
			// en fazla 3 ilan girebilir.
			System.out.println("Bireysel kullanıclar en fazla 3 ilan girebilir.");
		}
		System.out.println("createRealty :: " + realty.getTitle());
	}
	
	public List<Realty> getAll(){
		return realtyDao.findAll();
	}
	
	public void printAll(List<Realty> realtList) {
		realtList.forEach(realty -> System.out.println(realty));
	}

	public void getAllByProvince(String province) {
		
		getAll().stream()
		.filter(realty -> realty.getProvince().equals(province))
		//.count();
		.forEach(realty -> System.out.println(realty));
		
	}
	
	public List<Realty> getAllByUserName(User user){	
		return getAll().stream()
		.filter(realty -> realty.getUser().getMail().equals(user.getMail()))
		.toList();		
	}

	public List<Realty> getActiveRealtyByUserName(User user) {
		
		return getAll().stream()
		.filter(realty -> realty.getUser().getName().equals(user.getName()))
		.filter(realty -> RealtyType.ACTIVE.equals(realty.getType()))
		.toList();

	}
	//-----------------------------------Homework2 / Q7---------------------------------------
	public List<Realty> getByProvince(Realty realty){
		return getAll().stream()
		.filter(realty1 -> realty.getProvince().equals(realty.getProvince()))
		.toList();
	}
	public List<Realty> getByDistrict(Realty realty){
		return getAll().stream()
		.filter(realty1 -> realty.getDistrict().equals(realty.getProvince()))
		.toList();
	}

		long realtiesIstanbul = getAll().stream()
				.filter(realty -> realty.getProvince().contains("Istanbul")).count();
		long realtiesAnkara = getAll().stream()
				.filter(realty -> realty.getProvince().contains("Ankara")).count();
		long realtiesIzmir = getAll().stream()
				.filter(realty -> realty.getProvince().contains("Izmir")).count();

		long saleRealitiesIstanbul = getAll().stream()
				.filter(realty -> realty.getProvince().equals(realty.getType()))
				.filter(realty -> RealtyStatus.SALE.equals(realty.getStatus())).count();
		long saleRealitiesAnkara = getAll().stream()
				.filter(realty -> realty.getProvince().equals(realty.getType()))
				.filter(realty -> RealtyStatus.SALE.equals(realty.getStatus())).count();
		long saleRealitiesIzmir = getAll().stream()
				.filter(realty -> realty.getProvince().equals(realty.getType()))
				.filter(realty -> RealtyStatus.SALE.equals(realty.getStatus())).count();

	public long countThreeProvincesTotalRealties(){
		return realtiesIstanbul+realtiesAnkara+realtiesIzmir;
	}
	public long countThreeProvincesTotalSaleRealties(){
		return saleRealitiesIstanbul+saleRealitiesAnkara+saleRealitiesIzmir;
	}
}
