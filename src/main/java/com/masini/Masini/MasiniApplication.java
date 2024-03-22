package com.masini.Masini;

import com.masini.Masini.model.Masina;
import com.masini.Masini.model.Proprietar;
import com.masini.Masini.repository.MasinaRepository;
import com.masini.Masini.repository.ProprietarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class MasiniApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasiniApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(MasinaRepository masinaRepository, ProprietarRepository propietarRepository){
//		return args -> {
//
//
//			Masina masina=new Masina(null,"Logan", null);
//			Masina masina1=new Masina(null,"Bembeu",null);
//			ArrayList<Masina> masini= new ArrayList<>();
//			masini.add(masina);
//			masini.add(masina1);
//			masinaRepository.saveAll(masini);
//
//			Proprietar prop=new Proprietar(null,"Dorel",masini);
//			Proprietar propSaved=propietarRepository.save(prop);
//
//			prop.setNume("Dorin");
//			propietarRepository.save(propSaved);
//
//			masina.setProprietar(prop);
//			masinaRepository.save(masina);
//
//			masinaRepository.findById(1L).ifPresent(masina2 -> System.out.println(masina2.getProprietar().getNume()));
//			propietarRepository.findById(1L).ifPresent( propietar -> {
//				System.out.println(propietar.getMasini().get(0).getMarca());
//			});
//
//			//masinaRepository.delete(masina);
//		};
//	}

}
