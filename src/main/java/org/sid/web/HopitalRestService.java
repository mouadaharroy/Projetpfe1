package org.sid.web;

import java.util.List;

import org.sid.dao.HopitalRepository;
import org.sid.entites.Hopital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HopitalRestService {
	@Autowired
	private HopitalRepository hopitalRepository;
	@RequestMapping(value="/hopitals",method=RequestMethod.GET)
	public List<Hopital> getHopitals(){
		return hopitalRepository.findAll();
	}
	@RequestMapping(value="/hopitals/{id}",method=RequestMethod.GET)
	public Hopital getHopitals(@PathVariable long id){
		
		return hopitalRepository.findOne(id);
	}
	
	@RequestMapping(value="/chercherHopitals",method=RequestMethod.GET)
	public Page<Hopital> chercher(@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size){
		return hopitalRepository.chercher("%"+mc+"%", new PageRequest(page, size));
	}
	/*@RequestMapping(value="/chercherHopitals",method=RequestMethod.GET)
	public Page<Hopital> chercher(
		@RequestParam(name="mc",defaultValue="") String mc,
		@RequestParam(name="page",defaultValue="1") int page,
		@RequestParam(name="size",defaultValue="5") int size){
		Hopital h=new Hopital();
		h.setDepartement("cardie");
		Example<Hopital> e=Example.of(h, ExampleMatcher.matchingAny());
	return	hopitalRepository.findAll(e, new PageRequest(page, size));
		//return hopitalRepository.chercher("%"+mc+"%",new PageRequest(page, size));
	}
	*/
	@RequestMapping(value="/hopitals",method=RequestMethod.POST)
	public Hopital save(@RequestBody Hopital c){
		return hopitalRepository.save(c);
	}
	
	@RequestMapping(value="/hopitals/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable long id){
		 hopitalRepository.delete(id);
		 return true;
	}
	@RequestMapping(value="/hopitals/{id}",method=RequestMethod.PUT)
	public Hopital save(@PathVariable long id,@RequestBody Hopital c){
		c.setId(id);
		return hopitalRepository.save(c);
	}

}
