package net.nguyenthanhnam.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtractionController {
	@RequestMapping("/parse")
	public Item greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Item(1, name);
	}

}
