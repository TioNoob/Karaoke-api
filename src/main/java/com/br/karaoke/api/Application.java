package com.br.karaoke.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.br.karaoke.api.model.Music;
import com.br.karaoke.api.repository.interfaces.MusicRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner preLoadData(MusicRepository repository) {
		return (args) -> {
			repository.save(new Music("Fox, silver-backed", "Walt Cratere", 2004, false));
			repository.save(new Music("Fox, cape", "Athene Mc Combe", 2001, false));
			repository.save(new Music("Dove, ring", "Ewell De Clairmont", 1985, false));
			repository.save(new Music("South African hedgehog", "Bond Burgess", 2000, true));
			repository.save(new Music("Bulbul, black-eyed", "Ardys Gossington", 1998, false));
			repository.save(new Music("Gray rhea", "Kalil Riglar", 1997, false));
			repository.save(new Music("Squirrel, antelope ground", "Jude Hiley", 1996, false));
			repository.save(new Music("Kalahari scrub robin", "Brianne Potbury", 2012, false));
			repository.save(new Music("Marmot, hoary", "Allys Gabbatiss", 1996, false));
			repository.save(new Music("Dromedary camel", "Brose Riepl", 2005, false));
			repository.save(new Music("White-mantled colobus", "Lucia Francello", 1992, true));
			repository.save(new Music("Gambel's quail", "Rodrigo Brannon", 2008, false));
			repository.save(new Music("Jackal, black-backed", "Micky Eyckelberg", 2004, false));
			repository.save(new Music("Badger, european", "Nobie Collum", 1992, true));
			repository.save(new Music("Blesbok", "Duke Durbridge", 2010, true));
			repository.save(new Music("Gazer, sun", "Shae Eleshenar", 1992, true));
			repository.save(new Music("Flicker, campo", "Lind Daniello", 1994, true));
			repository.save(new Music("Squirrel, smith's bush", "Chrysler Brokenshaw", 1999, true));
			repository.save(new Music("Whale, killer", "Barnabas Rennolds", 2006, false));
			repository.save(new Music("Red deer", "Casey Detloff", 2002, false));
			repository.save(new Music("Rhea, gray", "Annalise Tomczynski", 1967, true));
			repository.save(new Music("Pocket gopher (unidentified)", "Natala Berzons", 1984, false));
			repository.save(new Music("Snake, buttermilk", "Barron Dorot", 1998, true));
			repository.save(new Music("Red-tailed cockatoo", "Archaimbaud Wysome", 2012, true));
			repository.save(new Music("Sifaka, verreaux's", "Nero Vaadeland", 1994, false));
			repository.save(new Music("Dove, galapagos", "Morie Munkley", 2000, true));
			repository.save(new Music("Cat, long-tailed spotted", "Binky Fairbank", 2010, true));
			repository.save(new Music("Grizzly bear", "Toby Willard", 1994, true));
			repository.save(new Music("Admiral, indian red", "Jamaal Soares", 1996, false));
			repository.save(new Music("Dragonfly, russian", "Olga Searjeant", 2004, false));
			repository.save(new Music("Caracara (unidentified)", "Galen Hospital", 2008, false));
			repository.save(new Music("Lynx, african", "Jeniece Dioniso", 1994, false));
			repository.save(new Music("Sheathbill, snowy", "Donielle Bodicam", 2006, false));
			repository.save(new Music("White-necked stork", "Diana Taggert", 2013, true));
			repository.save(new Music("Defassa waterbuck", "Everard Walsh", 2000, true));
			repository.save(new Music("Bleu, red-cheeked cordon", "Russell Thon", 2004, false));
			repository.save(new Music("Turkey vulture", "Allen Rollingson", 1998, true));
			repository.save(new Music("Zorilla", "Novelia Whyard", 1992, false));
			repository.save(new Music("Jaeger, long-tailed", "Milka Iggalden", 2011, true));
			repository.save(new Music("Thomson's gazelle", "Holden Imloch", 1994, false));
			repository.save(new Music("Heron, boat-billed", "Corrie Kirman", 1999, true));
			repository.save(new Music("Striped hyena", "Sadella Birtwhistle", 2008, true));
			repository.save(new Music("Hoopoe, eurasian", "Gretal Sidney", 1988, false));
			repository.save(new Music("Porcupine, north american", "Parsifal Brazener", 2011, false));
			repository.save(new Music("Black vulture", "Nara Bartolozzi", 1999, true));
			repository.save(new Music("Turaco, violet-crested", "Lorinda Birtwell", 1999, false));
			repository.save(new Music("Black curlew", "Cassie Paudin", 1997, false));
			repository.save(new Music("Kelp gull", "Batholomew Dean", 1998, false));
			repository.save(new Music("Lava gull", "Georgette Moorwood", 1993, true));
			repository.save(new Music("Common eland", "Marabel Blondelle", 1996, true));
			repository.save(new Music("Vicuna", "Taffy Gerler", 1995, true));
			repository.save(new Music("Tiger", "Michaela Trebble", 1994, true));
			repository.save(new Music("Red-winged blackbird", "Conant Ethridge", 2005, true));
			repository.save(new Music("Glider, feathertail", "Arda Kerrich", 2004, false));
			repository.save(new Music("Robin, white-throated", "Laney Stritton", 1993, false));
			repository.save(new Music("Tarantula", "Janette Bickley", 1992, true));
			repository.save(new Music("Fox, savanna", "Felice Grinaway", 1999, false));
			repository.save(new Music("Vulture, oriental white-backed", "Timoteo Benjamin", 2001, true));
			repository.save(new Music("Wild boar", "Sallyanne Gladhill", 2002, false));
			repository.save(new Music("Badger, european", "Blondell Brearty", 2011, true));
			repository.save(new Music("Lesser masked weaver", "Gradeigh Cloy", 1970, true));
			repository.save(new Music("Indian star tortoise", "Jessie Lombardo", 2010, false));
			repository.save(new Music("Common brushtail possum", "Verena Snoding", 2009, true));
			repository.save(new Music("Black-crowned night heron", "Holt Beardall", 1994, false));
			repository.save(new Music("Wombat, southern hairy-nosed", "Farah Rossbrooke", 2010, true));
			repository.save(new Music("Common boubou shrike", "Basia Habbershon", 1999, true));
			repository.save(new Music("Kiskadee, great", "Kain Crowch", 1990, true));
			repository.save(new Music("Ocelot", "Friederike Jagiela", 2005, false));
			repository.save(new Music("Hummingbird (unidentified)", "Berti Seacombe", 2011, true));
			repository.save(new Music("Margay", "Carree Garrals", 1991, true));
			repository.save(new Music("Suricate", "Christa Mundell", 1999, true));
			repository.save(new Music("Cockatoo, roseate", "Fletcher Muress", 2009, false));
			repository.save(new Music("Lion, california sea", "Michaela Perot", 2001, true));
			repository.save(new Music("Blue-tongued lizard", "Jorry Berkely", 1998, false));
			repository.save(new Music("Dromedary camel", "Paton Slipper", 1993, false));
			repository.save(new Music("Mynah, indian", "Shep Tumelty", 2005, false));
			repository.save(new Music("Giant anteater", "Nappy Coveley", 2012, true));
			repository.save(new Music("Pied cormorant", "Ferne Freiburger", 1995, true));
			repository.save(new Music("Palm squirrel", "Dian Giacoppo", 2011, false));
			repository.save(new Music("Squirrel, eurasian red", "Trstram Livezley", 2009, true));
			repository.save(new Music("Zorro, azara's", "Eugen Atchly", 1997, true));
			repository.save(new Music("Thirteen-lined squirrel", "Griffith Janas", 2000, true));
			repository.save(new Music("Crane, sandhill", "Alfie Ickovici", 1997, false));
			repository.save(new Music("Capybara", "Leta MacGebenay", 2008, true));
			repository.save(new Music("Waved albatross", "Killian Peacher", 2008, false));
			repository.save(new Music("Striated heron", "Don Francais", 2010, true));
			repository.save(new Music("African polecat", "Ag Plowes", 2011, false));
			repository.save(new Music("Langur, common", "Carlo Ffrench", 1997, false));
			repository.save(new Music("Wallaby, red-necked", "Hoyt Mateus", 1999, false));
			repository.save(new Music("Manatee", "Gerri Caston", 1993, true));
			repository.save(new Music("Indian peacock", "Jerrome Bonsale", 2004, false));
			repository.save(new Music("Slender loris", "Ame MacAless", 2000, false));
			repository.save(new Music("Dragon, komodo", "Graig Coldham", 1992, true));
			repository.save(new Music("Screamer, crested", "Hagan Barbe", 2001, false));
			repository.save(new Music("Tarantula, salmon pink bird eater", "Stacey Fronzek", 1992, true));
			repository.save(new Music("Mynah, indian", "Traver Flight", 1994, true));
			repository.save(new Music("Porcupine, crested", "Elenore Gulliman", 2003, false));
			repository.save(new Music("White-tailed jackrabbit", "Zara Caller", 1984, true));
			repository.save(new Music("Creeper, black-tailed tree", "Fionnula Sarson", 1987, false));
			repository.save(new Music("Gecko, bent-toed", "Aggie Linning", 2001, true));
		};
	}

}