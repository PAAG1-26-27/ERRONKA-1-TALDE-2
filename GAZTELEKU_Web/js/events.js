// Adibideko ekintzen datuak eta jatorrizko kodeak / Sample activity data and original codes
const eventCatalog = [
  {
    "code": "EK002",
    "name": {
      "eu": "Futbol lagunartekoa",
      "en": "Friendly football match"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-01-10",
    "endDate": "2027-01-10",
    "startTime": "10:00",
    "endTime": "12:00",
    "price": 0,
    "capacity": 20,
    "location": {
      "eu": "Ermua, kanpoko kirol-eremua",
      "en": "Ermua, outdoor sports area"
    },
    "description": {
      "eu": "Talde mistoetako futbol-partidak, txandaka jokatzeko eta lagun berriak ezagutzeko.",
      "en": "Mixed-team football games with rotating teams and time to meet new people."
    },
    "featured": true
  },
  {
    "code": "EK003",
    "name": {
      "eu": "Saskibaloiko lagunarteko partidak",
      "en": "Friendly basketball games"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-01-16",
    "endDate": "2027-01-16",
    "startTime": "10:00",
    "endTime": "12:00",
    "price": 0,
    "capacity": 18,
    "location": {
      "eu": "Ermua, kanpoko kirol-eremua",
      "en": "Ermua, outdoor sports area"
    },
    "description": {
      "eu": "Saskibaloiko oinarrizko ariketak eta lagunarteko partidak, talde orekatuetan.",
      "en": "Basic basketball exercises and friendly matches with balanced teams."
    }
  },
  {
    "code": "EK004",
    "name": {
      "eu": "Natura zaintzen",
      "en": "Looking after nature"
    },
    "type": "talk",
    "photo": "talk",
    "date": "2027-01-17",
    "endDate": "2027-01-17",
    "startTime": "11:00",
    "endTime": "12:00",
    "price": 0,
    "capacity": 30,
    "location": {
      "eu": "Ermua, Gaztelekuko aretoa",
      "en": "Ermua, Gazteleku hall"
    },
    "description": {
      "eu": "Oier Etxeberriak ingurunea zaintzeko ohiturak eta gazteentzako proposamenak azalduko ditu.",
      "en": "Oier Etxeberria will explain everyday ways to care for the environment and ideas for young people."
    },
    "speaker": "Oier Etxeberria",
    "featured": true
  },
  {
    "code": "EK005",
    "name": {
      "eu": "Haize Berriak taldearen kontzertua",
      "en": "Haize Berriak concert"
    },
    "type": "concert",
    "photo": "concert",
    "date": "2027-01-23",
    "endDate": "2027-01-23",
    "startTime": "19:00",
    "endTime": "20:30",
    "price": 6,
    "capacity": 100,
    "location": {
      "eu": "Ermua, Gaztelekuko eszenatokia",
      "en": "Ermua, Gazteleku stage"
    },
    "description": {
      "eu": "Haize Berriak taldearen euskarazko pop-rock emanaldia, gazteentzako abesti eta bertsioekin.",
      "en": "An evening of Basque pop-rock with Haize Berriak, featuring songs and covers for young people."
    },
    "performer": "Haize Berriak",
    "featured": true
  },
  {
    "code": "EK006",
    "name": {
      "eu": "Padel hastapena",
      "en": "Introduction to padel"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-01-24",
    "endDate": "2027-01-24",
    "startTime": "11:00",
    "endTime": "13:00",
    "price": 2,
    "capacity": 12,
    "location": {
      "eu": "Ermua, padel-pistak",
      "en": "Ermua, padel courts"
    },
    "description": {
      "eu": "Padelaren arauak eta oinarrizko kolpeak ikasteko saioa, binakako ariketekin.",
      "en": "Learn the rules and basic padel shots through exercises in pairs."
    }
  },
  {
    "code": "EK007",
    "name": {
      "eu": "Tenis txapelketa",
      "en": "Tennis tournament"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-01-30",
    "endDate": "2027-01-30",
    "startTime": "10:00",
    "endTime": "13:00",
    "price": 2,
    "capacity": 16,
    "location": {
      "eu": "Ermua, tenis-pistak",
      "en": "Ermua, tennis courts"
    },
    "description": {
      "eu": "Teniseko partida laburrak, parte-hartzaile guztiek hainbat txanda jokatzeko.",
      "en": "Short tennis matches so that every participant can play several rounds."
    }
  },
  {
    "code": "EK008",
    "name": {
      "eu": "Gasteizera egun-pasa",
      "en": "Day trip to Vitoria-Gasteiz"
    },
    "type": "trip",
    "photo": "trip",
    "date": "2027-01-31",
    "endDate": "2027-01-31",
    "startTime": "08:30",
    "endTime": "18:00",
    "price": 12,
    "capacity": 40,
    "location": {
      "eu": "Gasteiz, alde zaharra",
      "en": "Vitoria-Gasteiz, old town"
    },
    "description": {
      "eu": "Gasteizko alde zaharra ezagutzeko egun-pasa, bisita laburrarekin eta taldeko jolasekin.",
      "en": "Explore the old town of Vitoria-Gasteiz with a short visit and group games."
    }
  },
  {
    "code": "EK010",
    "name": {
      "eu": "Pilota hastapena",
      "en": "Introduction to Basque pelota"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-02-07",
    "endDate": "2027-02-07",
    "startTime": "10:00",
    "endTime": "12:00",
    "price": 1,
    "capacity": 16,
    "location": {
      "eu": "Ermua, pilotalekua",
      "en": "Ermua, pelota court"
    },
    "description": {
      "eu": "Pilota-jokoaren oinarriak, sakea eta binakako ariketa errazak lantzeko saioa.",
      "en": "Learn the basics of Basque pelota, serving and simple exercises in pairs."
    }
  },
  {
    "code": "EK011",
    "name": {
      "eu": "Ane Mendibururen akustikoa",
      "en": "Ane Mendiburu acoustic concert"
    },
    "type": "concert",
    "photo": "concert",
    "date": "2027-02-13",
    "endDate": "2027-02-13",
    "startTime": "18:30",
    "endTime": "20:00",
    "price": 4,
    "capacity": 60,
    "location": {
      "eu": "Ermua, Gaztelekuko eszenatokia",
      "en": "Ermua, Gazteleku stage"
    },
    "description": {
      "eu": "Ane Mendiburu abeslariaren kontzertu akustikoa, gitarra eta ahotsa ardatz hartuta.",
      "en": "An acoustic concert by singer Ane Mendiburu, built around guitar and voice."
    },
    "performer": "Ane Mendiburu"
  },
  {
    "code": "EK012",
    "name": {
      "eu": "Ermuko gazte lasterketa",
      "en": "Ermua youth run"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-02-14",
    "endDate": "2027-02-14",
    "startTime": "10:00",
    "endTime": "11:30",
    "price": 0,
    "capacity": 40,
    "location": {
      "eu": "Ermua, Herriko plaza",
      "en": "Ermua, town square"
    },
    "description": {
      "eu": "Erritmo lasaiko gazte lasterketa, beroketa bateratuarekin eta ibilbide laburrarekin.",
      "en": "A relaxed youth run with a group warm-up and a short route."
    }
  },
  {
    "code": "EK013",
    "name": {
      "eu": "Txingak ezagutzen",
      "en": "Discovering txingak"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-02-20",
    "endDate": "2027-02-20",
    "startTime": "17:00",
    "endTime": "18:30",
    "price": 0,
    "capacity": 20,
    "location": {
      "eu": "Ermua, Herriko plaza",
      "en": "Ermua, town square"
    },
    "description": {
      "eu": "Txingak zer diren ezagutu eta adinari egokitutako pisuekin taldeko erronkak egiteko saioa.",
      "en": "Discover the Basque weight-carrying game and try group challenges with age-appropriate weights."
    }
  },
  {
    "code": "EK014",
    "name": {
      "eu": "Emakumeak zientzian",
      "en": "Women in science"
    },
    "type": "talk",
    "photo": "talk",
    "date": "2027-02-21",
    "endDate": "2027-02-21",
    "startTime": "11:30",
    "endTime": "12:45",
    "price": 0,
    "capacity": 40,
    "location": {
      "eu": "Ermua, Gaztelekuko aretoa",
      "en": "Ermua, Gazteleku hall"
    },
    "description": {
      "eu": "Nahia Mendizabalen hitzaldia, emakume zientzialarien ekarpenei eta ikasketa-aukerei buruz.",
      "en": "Nahia Mendizabal will discuss the contributions of women scientists and opportunities for further study."
    },
    "speaker": "Nahia Mendizabal"
  },
  {
    "code": "EK015",
    "name": {
      "eu": "Bilboko Guggenheimera irteera",
      "en": "Trip to the Guggenheim in Bilbao"
    },
    "type": "trip",
    "photo": "trip",
    "date": "2027-02-27",
    "endDate": "2027-02-27",
    "startTime": "09:00",
    "endTime": "18:00",
    "price": 16,
    "capacity": 35,
    "location": {
      "eu": "Bilbo, Guggenheim museoa",
      "en": "Bilbao, Guggenheim Museum"
    },
    "description": {
      "eu": "Guggenheim museoa eta inguruak ezagutzeko irteera, arte garaikideari buruzko jarduerekin.",
      "en": "Visit the Guggenheim Museum and its surroundings with activities about contemporary art."
    }
  },
  {
    "code": "EK016",
    "name": {
      "eu": "Saskibaloiko jaurtiketa erronka",
      "en": "Basketball shooting challenge"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-02-28",
    "endDate": "2027-02-28",
    "startTime": "10:30",
    "endTime": "12:00",
    "price": 0,
    "capacity": 24,
    "location": {
      "eu": "Ermua, kanpoko kirol-eremua",
      "en": "Ermua, outdoor sports area"
    },
    "description": {
      "eu": "Saskibaloiko jaurtiketa eta pase erronkak, puntuazio jostagarriekin eta talde txikietan.",
      "en": "Basketball shooting and passing challenges with fun scoring in small groups."
    }
  },
  {
    "code": "EK017",
    "name": {
      "eu": "Harri Urdinak taldearen kontzertua",
      "en": "Harri Urdinak concert"
    },
    "type": "concert",
    "photo": "concert",
    "date": "2027-03-06",
    "endDate": "2027-03-06",
    "startTime": "19:00",
    "endTime": "20:30",
    "price": 8,
    "capacity": 100,
    "location": {
      "eu": "Ermua, Gaztelekuko eszenatokia",
      "en": "Ermua, Gazteleku stage"
    },
    "description": {
      "eu": "Harri Urdinak taldearen zuzenekoa, euskarazko rock abestiekin eta publikoaren parte-hartzearekin.",
      "en": "A live show by Harri Urdinak, featuring Basque rock songs and audience participation."
    },
    "performer": "Harri Urdinak"
  },
  {
    "code": "EK018",
    "name": {
      "eu": "Futbol txapelketa mistoa",
      "en": "Mixed-team football tournament"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-03-07",
    "endDate": "2027-03-07",
    "startTime": "11:00",
    "endTime": "13:00",
    "price": 2,
    "capacity": 32,
    "location": {
      "eu": "Ermua, kanpoko kirol-eremua",
      "en": "Ermua, outdoor sports area"
    },
    "description": {
      "eu": "Talde mistoen futbol txapelketa laburra, errespetua eta talde-lana lantzeko.",
      "en": "A short mixed-team football tournament focused on respect and teamwork."
    }
  },
  {
    "code": "EK019",
    "name": {
      "eu": "Musika sortzen etxean",
      "en": "Making music at home"
    },
    "type": "talk",
    "photo": "talk",
    "date": "2027-03-13",
    "endDate": "2027-03-13",
    "startTime": "17:00",
    "endTime": "18:00",
    "price": 2,
    "capacity": 30,
    "location": {
      "eu": "Ermua, Gaztelekuko aretoa",
      "en": "Ermua, Gazteleku hall"
    },
    "description": {
      "eu": "Eneko Garmendiak erritmoak sortzeko eta lehen abestia prestatzeko oinarriak azalduko ditu.",
      "en": "Eneko Garmendia will explain the basics of creating rhythms and preparing your first song."
    },
    "speaker": "Eneko Garmendia"
  },
  {
    "code": "EK020",
    "name": {
      "eu": "Donostiako Aquariumera irteera",
      "en": "Trip to the Aquarium in Donostia"
    },
    "type": "trip",
    "photo": "trip",
    "date": "2027-03-14",
    "endDate": "2027-03-14",
    "startTime": "08:30",
    "endTime": "19:00",
    "price": 18,
    "capacity": 40,
    "location": {
      "eu": "Donostia, Aquariuma",
      "en": "Donostia, Aquarium"
    },
    "description": {
      "eu": "Aquariumeko bisita eta itsas ingurunea ezagutzeko taldeko jarduera.",
      "en": "An aquarium visit followed by a group activity about the marine environment."
    }
  },
  {
    "code": "EK021",
    "name": {
      "eu": "Padel bikoteen topaketa",
      "en": "Padel pairs meetup"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-03-20",
    "endDate": "2027-03-20",
    "startTime": "10:00",
    "endTime": "12:00",
    "price": 2,
    "capacity": 16,
    "location": {
      "eu": "Ermua, padel-pistak",
      "en": "Ermua, padel courts"
    },
    "description": {
      "eu": "Padel-partida laburrak, bikoteak txandakatuz eta maila desberdinetako jokalariak nahastuz.",
      "en": "Short padel matches with rotating partners and players of different skill levels."
    }
  },
  {
    "code": "EK022",
    "name": {
      "eu": "Tenis hastapena",
      "en": "Introduction to tennis"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-03-21",
    "endDate": "2027-03-21",
    "startTime": "11:00",
    "endTime": "13:00",
    "price": 2,
    "capacity": 12,
    "location": {
      "eu": "Ermua, tenis-pistak",
      "en": "Ermua, tennis courts"
    },
    "description": {
      "eu": "Teniseko sakea, pilota-kontrola eta oinarrizko kolpeak lantzeko hastapen-saioa.",
      "en": "A beginners' session covering serving, ball control and basic tennis shots."
    }
  },
  {
    "code": "EK023",
    "name": {
      "eu": "Pilota bikoteen txapelketa",
      "en": "Basque pelota pairs tournament"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-04-03",
    "endDate": "2027-04-03",
    "startTime": "10:00",
    "endTime": "12:00",
    "price": 1,
    "capacity": 20,
    "location": {
      "eu": "Ermua, pilotalekua",
      "en": "Ermua, pelota court"
    },
    "description": {
      "eu": "Binakako pilota-partidak, txanda laburrekin eta parte-hartzaile guztientzako aukerekin.",
      "en": "Basque pelota games in pairs, with short rounds and opportunities for everyone to play."
    }
  },
  {
    "code": "EK024",
    "name": {
      "eu": "Gasteizko alde zaharra ezagutzen",
      "en": "Discovering the old town of Vitoria-Gasteiz"
    },
    "type": "trip",
    "photo": "trip",
    "date": "2027-04-10",
    "endDate": "2027-04-10",
    "startTime": "09:00",
    "endTime": "18:00",
    "price": 10,
    "capacity": 30,
    "location": {
      "eu": "Gasteiz, alde zaharra",
      "en": "Vitoria-Gasteiz, old town"
    },
    "description": {
      "eu": "Gasteizko kaleetan zehar kultur ibilbidea, argazki-erronkekin eta taldeko galderekin.",
      "en": "A cultural route through the streets of Vitoria-Gasteiz with photo challenges and group questions."
    }
  },
  {
    "code": "EK025",
    "name": {
      "eu": "Etorkizuneko lanbideak",
      "en": "Careers of the future"
    },
    "type": "talk",
    "photo": "talk",
    "date": "2027-04-11",
    "endDate": "2027-04-11",
    "startTime": "12:00",
    "endTime": "13:30",
    "price": 0,
    "capacity": 45,
    "location": {
      "eu": "Ermua, Gaztelekuko aretoa",
      "en": "Ermua, Gazteleku hall"
    },
    "description": {
      "eu": "Leire Agirreren solasaldia, teknologiarekin eta sormenarekin lotutako lanbideei buruz.",
      "en": "A talk by Leire Agirre about careers linked to technology and creativity."
    },
    "speaker": "Leire Agirre"
  },
  {
    "code": "EK026",
    "name": {
      "eu": "Irati Etxeberriaren kantaldia",
      "en": "Irati Etxeberria singing session"
    },
    "type": "concert",
    "photo": "concert",
    "date": "2027-04-17",
    "endDate": "2027-04-17",
    "startTime": "18:00",
    "endTime": "19:00",
    "price": 4,
    "capacity": 60,
    "location": {
      "eu": "Ermua, Gaztelekuko eszenatokia",
      "en": "Ermua, Gazteleku stage"
    },
    "description": {
      "eu": "Irati Etxeberria abeslariaren emanaldia, euskal kanta ezagunen bertsio lasaiekin.",
      "en": "A performance by singer Irati Etxeberria with relaxed versions of familiar Basque songs."
    },
    "performer": "Irati Etxeberria"
  },
  {
    "code": "EK027",
    "name": {
      "eu": "Orientazio-jolasa",
      "en": "Orienteering game"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-04-18",
    "endDate": "2027-04-18",
    "startTime": "10:00",
    "endTime": "11:30",
    "price": 0,
    "capacity": 24,
    "location": {
      "eu": "Ermua, parke-eremua",
      "en": "Ermua, park area"
    },
    "description": {
      "eu": "Mapa sinple baten laguntzaz pistak bilatzeko orientazio-jolasa, talde txikietan.",
      "en": "Find clues with the help of a simple map while working in small groups."
    }
  },
  {
    "code": "EK028",
    "name": {
      "eu": "Errelebo lasterketa",
      "en": "Relay race"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-04-24",
    "endDate": "2027-04-24",
    "startTime": "10:00",
    "endTime": "11:30",
    "price": 0,
    "capacity": 30,
    "location": {
      "eu": "Ermua, kanpoko kirol-eremua",
      "en": "Ermua, outdoor sports area"
    },
    "description": {
      "eu": "Taldekako errelebo lasterketak eta koordinazio-jolasak, distantzia laburretan.",
      "en": "Team relay races and coordination games over short distances."
    }
  },
  {
    "code": "EK029",
    "name": {
      "eu": "Bilboko arte eta arkitektura ibilbidea",
      "en": "Art and architecture in Bilbao"
    },
    "type": "trip",
    "photo": "trip",
    "date": "2027-05-01",
    "endDate": "2027-05-01",
    "startTime": "09:30",
    "endTime": "18:00",
    "price": 12,
    "capacity": 30,
    "location": {
      "eu": "Bilbo, Guggenheim ingurua",
      "en": "Bilbao, Guggenheim area"
    },
    "description": {
      "eu": "Guggenheim inguruko artea eta arkitektura ezagutzeko kultur irteera.",
      "en": "A cultural trip to discover the art and architecture around the Guggenheim Museum."
    }
  },
  {
    "code": "EK030",
    "name": {
      "eu": "Saskibaloi 3x3",
      "en": "3x3 basketball"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-05-02",
    "endDate": "2027-05-02",
    "startTime": "11:00",
    "endTime": "13:00",
    "price": 2,
    "capacity": 24,
    "location": {
      "eu": "Ermua, kanpoko kirol-eremua",
      "en": "Ermua, outdoor sports area"
    },
    "description": {
      "eu": "Hiruko taldeen saskibaloi topaketa, partida laburrekin eta taldeak txandakatuz.",
      "en": "A three-a-side basketball meetup with short matches and rotating teams."
    }
  },
  {
    "code": "EK031",
    "name": {
      "eu": "Txinga erronka",
      "en": "Txingak challenge"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-05-08",
    "endDate": "2027-05-08",
    "startTime": "17:00",
    "endTime": "18:00",
    "price": 0,
    "capacity": 16,
    "location": {
      "eu": "Ermua, Herriko plaza",
      "en": "Ermua, town square"
    },
    "description": {
      "eu": "Txinga arinekin egindako erronkak, oreka, koordinazioa eta taldeko animoa lantzeko.",
      "en": "Challenges with light carrying weights to practise balance and coordination while encouraging teammates."
    }
  },
  {
    "code": "EK032",
    "name": {
      "eu": "Basoko Hotsak taldearen kontzertua",
      "en": "Basoko Hotsak concert"
    },
    "type": "concert",
    "photo": "concert",
    "date": "2027-05-15",
    "endDate": "2027-05-15",
    "startTime": "19:00",
    "endTime": "21:00",
    "price": 6,
    "capacity": 100,
    "location": {
      "eu": "Ermua, Gaztelekuko eszenatokia",
      "en": "Ermua, Gazteleku stage"
    },
    "description": {
      "eu": "Basoko Hotsak taldearen folk-pop kontzertua, dantzarako eta elkarrekin abesteko.",
      "en": "A folk-pop concert by Basoko Hotsak, with opportunities to dance and sing together."
    },
    "performer": "Basoko Hotsak"
  },
  {
    "code": "EK033",
    "name": {
      "eu": "Futbol zirkuitua",
      "en": "Football skills circuit"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-05-23",
    "endDate": "2027-05-23",
    "startTime": "10:00",
    "endTime": "12:00",
    "price": 0,
    "capacity": 20,
    "location": {
      "eu": "Ermua, kanpoko kirol-eremua",
      "en": "Ermua, outdoor sports area"
    },
    "description": {
      "eu": "Futboleko pase, jaurtiketa eta pilota-kontrol postuak dituen zirkuitu dibertigarria.",
      "en": "A fun circuit with football passing, shooting and ball-control stations."
    }
  },
  {
    "code": "EK034",
    "name": {
      "eu": "Mikel Aranbururen kontzertua",
      "en": "Mikel Aranburu concert"
    },
    "type": "concert",
    "photo": "concert",
    "date": "2027-06-05",
    "endDate": "2027-06-05",
    "startTime": "19:00",
    "endTime": "20:30",
    "price": 5,
    "capacity": 80,
    "location": {
      "eu": "Ermua, Gaztelekuko eszenatokia",
      "en": "Ermua, Gazteleku stage"
    },
    "description": {
      "eu": "Mikel Aranburu kantautorearen zuzenekoa, euskarazko abesti propioekin.",
      "en": "A live performance by singer-songwriter Mikel Aranburu, featuring original songs in Basque."
    },
    "performer": "Mikel Aranburu"
  },
  {
    "code": "EK035",
    "name": {
      "eu": "Gazteen kirol goiza",
      "en": "Youth sports morning"
    },
    "type": "game",
    "photo": "game",
    "date": "2027-06-06",
    "endDate": "2027-06-06",
    "startTime": "10:00",
    "endTime": "13:00",
    "price": 2,
    "capacity": 40,
    "location": {
      "eu": "Ermua, kanpoko kirol-eremua",
      "en": "Ermua, outdoor sports area"
    },
    "description": {
      "eu": "Futbola, saskibaloia eta errelebo-jolasak konbinatzen dituen kirol goiza.",
      "en": "A sports morning combining football, basketball and relay games."
    }
  },
  {
    "code": "EK036",
    "name": {
      "eu": "Donostiako itsas mundua",
      "en": "Discovering marine life in Donostia"
    },
    "type": "trip",
    "photo": "trip",
    "date": "2027-06-12",
    "endDate": "2027-06-12",
    "startTime": "08:00",
    "endTime": "19:00",
    "price": 18,
    "capacity": 40,
    "location": {
      "eu": "Donostia, Aquariuma eta portua",
      "en": "Donostia, Aquarium and harbour"
    },
    "description": {
      "eu": "Aquariuma eta portua ezagutzeko egun-pasa, itsas bizitzari buruzko taldeko erronkekin.",
      "en": "A day trip to the aquarium and harbour with group challenges about marine life."
    }
  },
  {
    "code": "EK037",
    "name": {
      "eu": "Udalaitzera mendi-buelta",
      "en": "Mountain walk on Udalaitz"
    },
    "type": "mountain_trip",
    "photo": "mountain_trip",
    "date": "2027-06-22",
    "endDate": "2027-06-22",
    "startTime": "08:30",
    "endTime": "13:30",
    "price": 0,
    "capacity": 20,
    "location": {
      "eu": "Udalaitz, mendi-ingurua",
      "en": "Udalaitz, mountain area"
    },
    "description": {
      "eu": "Udalaitz inguruko taldeko mendi-buelta, atsedenaldiekin eta natura behatzeko tarteekin.",
      "en": "A group walk around Udalaitz with breaks and time to observe nature."
    }
  },
  {
    "code": "EK038",
    "name": {
      "eu": "Surf hastapena Zarautzen",
      "en": "Introduction to surfing in Zarautz"
    },
    "type": "surf_intro",
    "photo": "surf_intro",
    "date": "2027-06-23",
    "endDate": "2027-06-23",
    "startTime": "11:00",
    "endTime": "13:00",
    "price": 2,
    "capacity": 12,
    "location": {
      "eu": "Zarautz, hondartza",
      "en": "Zarautz, beach"
    },
    "description": {
      "eu": "Surfeko lehen urratsak, oinarrizko segurtasuna eta taulan oreka lantzeko saioa.",
      "en": "Take your first steps in surfing, covering basic safety and balance on the board."
    }
  },
  {
    "code": "EK039",
    "name": {
      "eu": "Paddle surf Zarautzen",
      "en": "Paddle surfing in Zarautz"
    },
    "type": "paddle_surf",
    "photo": "paddle_surf",
    "date": "2027-06-25",
    "endDate": "2027-06-25",
    "startTime": "10:00",
    "endTime": "12:00",
    "price": 2,
    "capacity": 10,
    "location": {
      "eu": "Zarautz, hondartza",
      "en": "Zarautz, beach"
    },
    "description": {
      "eu": "Paddle surf taulan oreka eta arraunketa ikasteko hastapen-saioa.",
      "en": "An introductory session to learn balance and paddling on a stand-up paddleboard."
    }
  },
  {
    "code": "EK040",
    "name": {
      "eu": "Gazte afaria",
      "en": "Youth dinner"
    },
    "type": "night_activity",
    "photo": "youth_dinner",
    "date": "2027-06-26",
    "endDate": "2027-06-26",
    "startTime": "20:00",
    "endTime": "22:30",
    "price": 4,
    "capacity": 40,
    "location": {
      "eu": "Ermua, Gaztelekuko aretoa",
      "en": "Ermua, Gazteleku hall"
    },
    "description": {
      "eu": "Gazteen afari partekatua, elkar ezagutzeko jolasekin eta mahai arteko erronkekin.",
      "en": "A shared youth dinner with get-to-know-you games and table challenges."
    }
  },
  {
    "code": "EK041",
    "name": {
      "eu": "Urbiara mendi-irteera",
      "en": "Mountain trip to Urbia"
    },
    "type": "mountain_trip",
    "photo": "mountain_trip",
    "date": "2027-06-29",
    "endDate": "2027-06-29",
    "startTime": "08:00",
    "endTime": "16:00",
    "price": 2,
    "capacity": 24,
    "location": {
      "eu": "Urbia, mendiko zelaiak",
      "en": "Urbia, mountain meadows"
    },
    "description": {
      "eu": "Urbiako ingurunea ezagutzeko mendi-irteera, taldeko erritmoan eta bazkaltzeko geldialdiarekin.",
      "en": "Explore the Urbia area at the group's pace, with a stop for lunch."
    }
  },
  {
    "code": "EK042",
    "name": {
      "eu": "Surf hastapena Deban",
      "en": "Introduction to surfing in Deba"
    },
    "type": "surf_intro",
    "photo": "surf_intro",
    "date": "2027-06-30",
    "endDate": "2027-06-30",
    "startTime": "10:00",
    "endTime": "12:00",
    "price": 2,
    "capacity": 12,
    "location": {
      "eu": "Deba, hondartza",
      "en": "Deba, beach"
    },
    "description": {
      "eu": "Surfeko hastapen-saioa, taula erabiltzeko eta lehen olatuak probatzeko.",
      "en": "A beginners' surfing session to learn how to use the board and try your first waves."
    }
  },
  {
    "code": "EK043",
    "name": {
      "eu": "Kurtzebarrira mendi-irteera",
      "en": "Mountain trip to Kurtzebarri"
    },
    "type": "mountain_trip",
    "photo": "mountain_trip",
    "date": "2027-07-06",
    "endDate": "2027-07-06",
    "startTime": "09:00",
    "endTime": "14:00",
    "price": 0,
    "capacity": 18,
    "location": {
      "eu": "Kurtzebarri, mendi-ingurua",
      "en": "Kurtzebarri, mountain area"
    },
    "description": {
      "eu": "Kurtzebarri inguruko mendi-buelta, paisaia behatzeko eta orientazioa lantzeko.",
      "en": "A walk around Kurtzebarri to enjoy the landscape and practise navigation."
    }
  },
  {
    "code": "EK044",
    "name": {
      "eu": "Lehen olatuak Zarautzen",
      "en": "First waves in Zarautz"
    },
    "type": "surf_intro",
    "photo": "surf_intro",
    "date": "2027-07-07",
    "endDate": "2027-07-07",
    "startTime": "12:00",
    "endTime": "14:00",
    "price": 2,
    "capacity": 10,
    "location": {
      "eu": "Zarautz, hondartza",
      "en": "Zarautz, beach"
    },
    "description": {
      "eu": "Taulan altxatzeko ariketak eta lehen olatuak hartzeko talde txikiko saioa.",
      "en": "A small-group session with exercises to stand up on the board and catch your first waves."
    }
  },
  {
    "code": "EK045",
    "name": {
      "eu": "Paddle surf Deban",
      "en": "Paddle surfing in Deba"
    },
    "type": "paddle_surf",
    "photo": "paddle_surf",
    "date": "2027-07-09",
    "endDate": "2027-07-09",
    "startTime": "11:00",
    "endTime": "13:00",
    "price": 2,
    "capacity": 10,
    "location": {
      "eu": "Deba, hondartza",
      "en": "Deba, beach"
    },
    "description": {
      "eu": "Taula eta arrauna erabiltzen ikasteko saioa, talde txikian eta oinarrizko ariketekin.",
      "en": "Learn to use the board and paddle in a small group with basic exercises."
    }
  },
  {
    "code": "EK046",
    "name": {
      "eu": "Gazte afari tematikoa",
      "en": "Themed youth dinner"
    },
    "type": "night_activity",
    "photo": "youth_dinner",
    "date": "2027-07-10",
    "endDate": "2027-07-10",
    "startTime": "19:30",
    "endTime": "22:00",
    "price": 5,
    "capacity": 40,
    "location": {
      "eu": "Ermua, Gaztelekuko aretoa",
      "en": "Ermua, Gazteleku hall"
    },
    "description": {
      "eu": "Udako afari tematikoa, taldeko apaingarriekin eta afalosteko galdetegi jostagarriarekin.",
      "en": "A themed summer dinner with group decorations and a fun quiz after the meal."
    }
  },
  {
    "code": "EK047",
    "name": {
      "eu": "Anboto inguruko mendi-buelta",
      "en": "Mountain walk around Anboto"
    },
    "type": "mountain_trip",
    "photo": "mountain_trip",
    "date": "2027-07-13",
    "endDate": "2027-07-13",
    "startTime": "08:00",
    "endTime": "15:00",
    "price": 2,
    "capacity": 20,
    "location": {
      "eu": "Anboto, mendi-ingurua",
      "en": "Anboto, mountain area"
    },
    "description": {
      "eu": "Anboto ingurua ezagutzeko taldeko ibilaldia, tontorrera igo gabe eta atsedenaldiekin.",
      "en": "A group walk around Anboto, with rest stops and without climbing to the summit."
    }
  },
  {
    "code": "EK048",
    "name": {
      "eu": "Surf eta oreka Deban",
      "en": "Surfing and balance in Deba"
    },
    "type": "surf_intro",
    "photo": "surf_intro",
    "date": "2027-07-14",
    "endDate": "2027-07-14",
    "startTime": "09:30",
    "endTime": "11:30",
    "price": 2,
    "capacity": 12,
    "location": {
      "eu": "Deba, hondartza",
      "en": "Deba, beach"
    },
    "description": {
      "eu": "Oreka, arraunketa eta taularen kontrola lantzeko surf hastapen-saioa.",
      "en": "A beginners' surfing session to practise balance, paddling and board control."
    }
  },
  {
    "code": "EK049",
    "name": {
      "eu": "Udalaitz inguruko natura ibilbidea",
      "en": "Nature walk around Udalaitz"
    },
    "type": "mountain_trip",
    "photo": "mountain_trip",
    "date": "2027-07-20",
    "endDate": "2027-07-20",
    "startTime": "08:30",
    "endTime": "14:00",
    "price": 0,
    "capacity": 20,
    "location": {
      "eu": "Udalaitz, mendi-ingurua",
      "en": "Udalaitz, mountain area"
    },
    "description": {
      "eu": "Landareak, paisaia eta mendiko ohiturak ezagutzeko natura ibilbidea.",
      "en": "A nature walk to discover plants, landscapes and good habits in the mountains."
    }
  },
  {
    "code": "EK050",
    "name": {
      "eu": "Paddle surf eta oreka Zarautzen",
      "en": "Paddle surfing and balance in Zarautz"
    },
    "type": "paddle_surf",
    "photo": "paddle_surf",
    "date": "2027-07-23",
    "endDate": "2027-07-23",
    "startTime": "09:00",
    "endTime": "11:00",
    "price": 2,
    "capacity": 12,
    "location": {
      "eu": "Zarautz, hondartza",
      "en": "Zarautz, beach"
    },
    "description": {
      "eu": "Paddle surfeko oreka-jolasak eta norabidea aldatzeko ariketak.",
      "en": "Paddleboard balance games and exercises to practise changing direction."
    }
  },
  {
    "code": "EK051",
    "name": {
      "eu": "Udako gau festa",
      "en": "Summer evening party"
    },
    "type": "night_activity",
    "photo": "youth_dinner",
    "date": "2027-07-24",
    "endDate": "2027-07-24",
    "startTime": "20:00",
    "endTime": "23:00",
    "price": 4,
    "capacity": 60,
    "location": {
      "eu": "Ermua, Gaztelekuko patioa",
      "en": "Ermua, Gazteleku courtyard"
    },
    "description": {
      "eu": "Udako gau festa, musikarekin, taldeko jolasekin eta gazteen proposamenekin.",
      "en": "A summer evening party with music, group games and ideas contributed by young people."
    }
  },
  {
    "code": "EK052",
    "name": {
      "eu": "Urbiako zelaiak ezagutzen",
      "en": "Exploring the meadows of Urbia"
    },
    "type": "mountain_trip",
    "photo": "mountain_trip",
    "date": "2027-07-27",
    "endDate": "2027-07-27",
    "startTime": "08:00",
    "endTime": "16:00",
    "price": 2,
    "capacity": 24,
    "location": {
      "eu": "Urbia, mendiko zelaiak",
      "en": "Urbia, mountain meadows"
    },
    "description": {
      "eu": "Urbiako zelaietan zehar taldeko ibilaldia, argazki-erronkekin eta bazkaltzeko tartearekin.",
      "en": "A group walk through the meadows of Urbia with photo challenges and time for lunch."
    }
  },
  {
    "code": "EK053",
    "name": {
      "eu": "Surf goiza Zarautzen",
      "en": "Surfing morning in Zarautz"
    },
    "type": "surf_intro",
    "photo": "surf_intro",
    "date": "2027-07-28",
    "endDate": "2027-07-28",
    "startTime": "11:00",
    "endTime": "13:00",
    "price": 2,
    "capacity": 14,
    "location": {
      "eu": "Zarautz, hondartza",
      "en": "Zarautz, beach"
    },
    "description": {
      "eu": "Surfeko oinarrizko teknikak berrikusi eta olatu txikietan praktikatzeko saioa.",
      "en": "Review basic surfing techniques and practise on small waves."
    }
  },
  {
    "code": "EK054",
    "name": {
      "eu": "Kurtzebarriko orientazio ibilbidea",
      "en": "Orienteering walk on Kurtzebarri"
    },
    "type": "mountain_trip",
    "photo": "mountain_trip",
    "date": "2027-08-03",
    "endDate": "2027-08-03",
    "startTime": "09:00",
    "endTime": "14:00",
    "price": 0,
    "capacity": 18,
    "location": {
      "eu": "Kurtzebarri, mendi-ingurua",
      "en": "Kurtzebarri, mountain area"
    },
    "description": {
      "eu": "Mapa sinplea irakurtzeko eta mendiko erreferentziak identifikatzeko ibilaldia.",
      "en": "A walk to practise reading a simple map and identifying mountain landmarks."
    }
  },
  {
    "code": "EK055",
    "name": {
      "eu": "Paddle surf taldeko erronka Deban",
      "en": "Paddleboard team challenge in Deba"
    },
    "type": "paddle_surf",
    "photo": "paddle_surf",
    "date": "2027-08-06",
    "endDate": "2027-08-06",
    "startTime": "12:00",
    "endTime": "14:00",
    "price": 2,
    "capacity": 12,
    "location": {
      "eu": "Deba, hondartza",
      "en": "Deba, beach"
    },
    "description": {
      "eu": "Arraunketa eta oreka uztartzen dituzten paddle surfeko taldeko erronka errazak.",
      "en": "Simple team paddleboard challenges combining paddling and balance."
    }
  },
  {
    "code": "EK056",
    "name": {
      "eu": "Gazte afaria eta mahai-jolasak",
      "en": "Youth dinner and board games"
    },
    "type": "night_activity",
    "photo": "youth_dinner",
    "date": "2027-08-07",
    "endDate": "2027-08-07",
    "startTime": "20:30",
    "endTime": "23:00",
    "price": 4,
    "capacity": 40,
    "location": {
      "eu": "Ermua, Gaztelekuko aretoa",
      "en": "Ermua, Gazteleku hall"
    },
    "description": {
      "eu": "Afari partekatua eta ondorengo mahai-jolasen saioa, talde txikietan.",
      "en": "A shared dinner followed by a board-game session in small groups."
    }
  },
  {
    "code": "EK057",
    "name": {
      "eu": "Anboto inguruko paisaiak",
      "en": "Landscapes around Anboto"
    },
    "type": "mountain_trip",
    "photo": "mountain_trip",
    "date": "2027-08-10",
    "endDate": "2027-08-10",
    "startTime": "08:00",
    "endTime": "15:00",
    "price": 2,
    "capacity": 20,
    "location": {
      "eu": "Anboto, mendi-ingurua",
      "en": "Anboto, mountain area"
    },
    "description": {
      "eu": "Anboto inguruko paisaiak ezagutzeko mendi-irteera, taldeko erritmo lasaian.",
      "en": "A mountain trip to discover the landscapes around Anboto at a relaxed group pace."
    }
  },
  {
    "code": "EK058",
    "name": {
      "eu": "Surf hastapeneko talde berria Deban",
      "en": "New beginners' surfing group in Deba"
    },
    "type": "surf_intro",
    "photo": "surf_intro",
    "date": "2027-08-11",
    "endDate": "2027-08-11",
    "startTime": "10:00",
    "endTime": "12:00",
    "price": 2,
    "capacity": 10,
    "location": {
      "eu": "Deba, hondartza",
      "en": "Deba, beach"
    },
    "description": {
      "eu": "Aurretik surfean ibili ez diren gazteentzako lehen saioa, ariketa errazekin.",
      "en": "A first surfing session with simple exercises for young people who have never tried surfing."
    }
  },
  {
    "code": "EK059",
    "name": {
      "eu": "Halloween mozorro tailerra eta festa",
      "en": "Halloween costume workshop and party"
    },
    "type": "night_activity",
    "photo": "halloween",
    "date": "2027-10-30",
    "endDate": "2027-10-30",
    "startTime": "18:30",
    "endTime": "22:00",
    "price": 3,
    "capacity": 40,
    "location": {
      "eu": "Ermua, Gaztelekuko aretoa",
      "en": "Ermua, Gazteleku hall"
    },
    "description": {
      "eu": "Halloweeneko mozorroak prestatzeko tailerra eta ondorengo festa, argazki-erronkekin.",
      "en": "Make Halloween costumes and enjoy a party afterwards with photo challenges."
    }
  },
  {
    "code": "EK060",
    "name": {
      "eu": "Halloween gaua",
      "en": "Halloween night"
    },
    "type": "night_activity",
    "photo": "halloween",
    "date": "2027-10-31",
    "endDate": "2027-11-01",
    "startTime": "20:00",
    "endTime": "00:30",
    "price": 5,
    "capacity": 60,
    "location": {
      "eu": "Ermua, Gaztelekuko aretoa",
      "en": "Ermua, Gazteleku hall"
    },
    "description": {
      "eu": "Halloweeneko gau berezia, mozorroekin eta musikarekin. Jarduera hurrengo egunean amaituko da.",
      "en": "A special Halloween evening with costumes, music and group games. The activity ends the following day."
    }
  }
];
