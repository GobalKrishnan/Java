package gki.date;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.annotation.Generated;

public class Date {
public int year,month,date;
public static int hour;
public static int minute;
public static int second;
public static int millisecond;
public TimeZone timeZone;
public static String status;
 public static int      january  = 0,
                        februray = 1,
                        march    = 2,
                        april    = 3,
                        may      = 4,
                        june     = 5,
                        july     = 6,
                        august   = 7,
                        september= 8,
                        october  = 9,
                        november = 10,
                        december = 11,
                        
                        sunday    = 1,
                        monday    = 2,
                        tuesday   = 3,
                        wednesday = 4,
                        thursday  = 5,
                        friday    = 6,
                        saturday  = 7,
                        
                        no_of_day_in_year,
                        no_of_month_in_year,
                        no_of_week_in_year,
                        no_of_hour_in_year,
                        no_of_minute_in_year,
                        no_of_second_in_year,
                        no_of_millisecond_in_year,
                        
                        no_of_day_in_month,
                        no_of_week_in_month,
                        no_of_hour_in_month,
                        no_of_minute_in_month,
                        no_of_second_in_month,
                        no_of_millisecond_in_month,
                        
                        no_of_day_in_week,
                        no_of_hour_in_week,
                        no_of_minute_in_week,
                        no_of_second_in_week,
                        no_of_millisecond_in_week,
                        
                        no_of_hour_in_day,
                        no_of_minute_in_day,
                        no_of_second_in_day,
                        no_of_millisecond_in_day,
                        
                        no_of_minute_in_hour,
                        no_of_second_in_hour,
                        no_of_millisecond_in_hour,
                        
                        no_of_second_in_minute,
                        no_of_millisecond_in_minute,
                        
                        no_of_millisecond_in_second,
                         
                        AM=0,PM=1  
                          
                        ;

 final public static String Africa_Abidjan = "Africa/Abidjan";
 final public static String Africa_Accra = "Africa/Accra";
 final public static String Africa_Addis_Ababa = "Africa/Addis_Ababa";
 final public static String Africa_Algiers = "Africa/Algiers";
 final public static String Africa_Asmara = "Africa/Asmara";
 final public static String Africa_Asmera = "Africa/Asmera";
 final public static String Africa_Bamako = "Africa/Bamako";
 final public static String Africa_Bangui = "Africa/Bangui";
 final public static String Africa_Banjul = "Africa/Banjul";
 final public static String Africa_Bissau = "Africa/Bissau";
 final public static String Africa_Blantyre = "Africa/Blantyre";
 final public static String Africa_Brazzaville = "Africa/Brazzaville";
 final public static String Africa_Bujumbura = "Africa/Bujumbura";
 final public static String Africa_Cairo = "Africa/Cairo";
 final public static String Africa_Casablanca = "Africa/Casablanca";
 final public static String Africa_Ceuta = "Africa/Ceuta";
 final public static String Africa_Conakry = "Africa/Conakry";
 final public static String Africa_Dakar = "Africa/Dakar";
 final public static String Africa_Dar_es_Salaam = "Africa/Dar_es_Salaam";
 final public static String Africa_Djibouti = "Africa/Djibouti";
 final public static String Africa_Douala = "Africa/Douala";
 final public static String Africa_El_Aaiun = "Africa/El_Aaiun";
 final public static String Africa_Freetown = "Africa/Freetown";
 final public static String Africa_Gaborone = "Africa/Gaborone";
 final public static String Africa_Harare = "Africa/Harare";
 final public static String Africa_Johannesburg = "Africa/Johannesburg";
 final public static String Africa_Juba = "Africa/Juba";
 final public static String Africa_Kampala = "Africa/Kampala";
 final public static String Africa_Khartoum = "Africa/Khartoum";
 final public static String Africa_Kigali = "Africa/Kigali";
 final public static String Africa_Kinshasa = "Africa/Kinshasa";
 final public static String Africa_Lagos = "Africa/Lagos";
 final public static String Africa_Libreville = "Africa/Libreville";
 final public static String Africa_Lome = "Africa/Lome";
 final public static String Africa_Luanda = "Africa/Luanda";
 final public static String Africa_Lubumbashi = "Africa/Lubumbashi";
 final public static String Africa_Lusaka = "Africa/Lusaka";
 final public static String Africa_Malabo = "Africa/Malabo";
 final public static String Africa_Maputo = "Africa/Maputo";
 final public static String Africa_Maseru = "Africa/Maseru";
 final public static String Africa_Mbabane = "Africa/Mbabane";
 final public static String Africa_Mogadishu = "Africa/Mogadishu";
 final public static String Africa_Monrovia = "Africa/Monrovia";
 final public static String Africa_Nairobi = "Africa/Nairobi";
 final public static String Africa_Ndjamena = "Africa/Ndjamena";
 final public static String Africa_Niamey = "Africa/Niamey";
 final public static String Africa_Nouakchott = "Africa/Nouakchott";
 final public static String Africa_Ouagadougou = "Africa/Ouagadougou";
 final public static String Africa_Porto_Novo = "Africa/Porto-Novo";
 final public static String Africa_Sao_Tome = "Africa/Sao_Tome";
 final public static String Africa_Timbuktu = "Africa/Timbuktu";
 final public static String Africa_Tripoli = "Africa/Tripoli";
 final public static String Africa_Tunis = "Africa/Tunis";
 final public static String Africa_Windhoek = "Africa/Windhoek";
 final public static String America_Adak = "America/Adak";
 final public static String America_Anchorage = "America/Anchorage";
 final public static String America_Anguilla = "America/Anguilla";
 final public static String America_Antigua = "America/Antigua";
 final public static String America_Araguaina = "America/Araguaina";
 final public static String America_Argentina_Buenos_Aires = "America/Argentina/Buenos_Aires";
 final public static String America_Argentina_Catamarca = "America/Argentina/Catamarca";
 final public static String America_Argentina_ComodRivadavia = "America/Argentina/ComodRivadavia";
 final public static String America_Argentina_Cordoba = "America/Argentina/Cordoba";
 final public static String America_Argentina_Jujuy = "America/Argentina/Jujuy";
 final public static String America_Argentina_La_Rioja = "America/Argentina/La_Rioja";
 final public static String America_Argentina_Mendoza = "America/Argentina/Mendoza";
 final public static String America_Argentina_Rio_Gallegos = "America/Argentina/Rio_Gallegos";
 final public static String America_Argentina_Salta = "America/Argentina/Salta";
 final public static String America_Argentina_San_Juan = "America/Argentina/San_Juan";
 final public static String America_Argentina_San_Luis = "America/Argentina/San_Luis";
 final public static String America_Argentina_Tucuman = "America/Argentina/Tucuman";
 final public static String America_Argentina_Ushuaia = "America/Argentina/Ushuaia";
 final public static String America_Aruba = "America/Aruba";
 final public static String America_Asuncion = "America/Asuncion";
 final public static String America_Atikokan = "America/Atikokan";
 final public static String America_Atka = "America/Atka";
 final public static String America_Bahia = "America/Bahia";
 final public static String America_Bahia_Banderas = "America/Bahia_Banderas";
 final public static String America_Barbados = "America/Barbados";
 final public static String America_Belem = "America/Belem";
 final public static String America_Belize = "America/Belize";
 final public static String America_Blanc_Sablon = "America/Blanc-Sablon";
 final public static String America_Boa_Vista = "America/Boa_Vista";
 final public static String America_Bogota = "America/Bogota";
 final public static String America_Boise = "America/Boise";
 final public static String America_Buenos_Aires = "America/Buenos_Aires";
 final public static String America_Cambridge_Bay = "America/Cambridge_Bay";
 final public static String America_Campo_Grande = "America/Campo_Grande";
 final public static String America_Cancun = "America/Cancun";
 final public static String America_Caracas = "America/Caracas";
 final public static String America_Catamarca = "America/Catamarca";
 final public static String America_Cayenne = "America/Cayenne";
 final public static String America_Cayman = "America/Cayman";
 final public static String America_Chicago = "America/Chicago";
 final public static String America_Chihuahua = "America/Chihuahua";
 final public static String America_Coral_Harbour = "America/Coral_Harbour";
 final public static String America_Cordoba = "America/Cordoba";
 final public static String America_Costa_Rica = "America/Costa_Rica";
 final public static String America_Creston = "America/Creston";
 final public static String America_Cuiaba = "America/Cuiaba";
 final public static String America_Curacao = "America/Curacao";
 final public static String America_Danmarkshavn = "America/Danmarkshavn";
 final public static String America_Dawson = "America/Dawson";
 final public static String America_Dawson_Creek = "America/Dawson_Creek";
 final public static String America_Denver = "America/Denver";
 final public static String America_Detroit = "America/Detroit";
 final public static String America_Dominica = "America/Dominica";
 final public static String America_Edmonton = "America/Edmonton";
 final public static String America_Eirunepe = "America/Eirunepe";
 final public static String America_El_Salvador = "America/El_Salvador";
 final public static String America_Ensenada = "America/Ensenada";
 final public static String America_Fort_Nelson = "America/Fort_Nelson";
 final public static String America_Fort_Wayne = "America/Fort_Wayne";
 final public static String America_Fortaleza = "America/Fortaleza";
 final public static String America_Glace_Bay = "America/Glace_Bay";
 final public static String America_Godthab = "America/Godthab";
 final public static String America_Goose_Bay = "America/Goose_Bay";
 final public static String America_Grand_Turk = "America/Grand_Turk";
 final public static String America_Grenada = "America/Grenada";
 final public static String America_Guadeloupe = "America/Guadeloupe";
 final public static String America_Guatemala = "America/Guatemala";
 final public static String America_Guayaquil = "America/Guayaquil";
 final public static String America_Guyana = "America/Guyana";
 final public static String America_Halifax = "America/Halifax";
 final public static String America_Havana = "America/Havana";
 final public static String America_Hermosillo = "America/Hermosillo";
 final public static String America_Indiana_Indianapolis = "America/Indiana/Indianapolis";
 final public static String America_Indiana_Knox = "America/Indiana/Knox";
 final public static String America_Indiana_Marengo = "America/Indiana/Marengo";
 final public static String America_Indiana_Petersburg = "America/Indiana/Petersburg";
 final public static String America_Indiana_Tell_City = "America/Indiana/Tell_City";
 final public static String America_Indiana_Vevay = "America/Indiana/Vevay";
 final public static String America_Indiana_Vincennes = "America/Indiana/Vincennes";
 final public static String America_Indiana_Winamac = "America/Indiana/Winamac";
 final public static String America_Indianapolis = "America/Indianapolis";
 final public static String America_Inuvik = "America/Inuvik";
 final public static String America_Iqaluit = "America/Iqaluit";
 final public static String America_Jamaica = "America/Jamaica";
 final public static String America_Jujuy = "America/Jujuy";
 final public static String America_Juneau = "America/Juneau";
 final public static String America_Kentucky_Louisville = "America/Kentucky/Louisville";
 final public static String America_Kentucky_Monticello = "America/Kentucky/Monticello";
 final public static String America_Knox_IN = "America/Knox_IN";
 final public static String America_Kralendijk = "America/Kralendijk";
 final public static String America_La_Paz = "America/La_Paz";
 final public static String America_Lima = "America/Lima";
 final public static String America_Los_Angeles = "America/Los_Angeles";
 final public static String America_Louisville = "America/Louisville";
 final public static String America_Lower_Princes = "America/Lower_Princes";
 final public static String America_Maceio = "America/Maceio";
 final public static String America_Managua = "America/Managua";
 final public static String America_Manaus = "America/Manaus";
 final public static String America_Marigot = "America/Marigot";
 final public static String America_Martinique = "America/Martinique";
 final public static String America_Matamoros = "America/Matamoros";
 final public static String America_Mazatlan = "America/Mazatlan";
 final public static String America_Mendoza = "America/Mendoza";
 final public static String America_Menominee = "America/Menominee";
 final public static String America_Merida = "America/Merida";
 final public static String America_Metlakatla = "America/Metlakatla";
 final public static String America_Mexico_City = "America/Mexico_City";
 final public static String America_Miquelon = "America/Miquelon";
 final public static String America_Moncton = "America/Moncton";
 final public static String America_Monterrey = "America/Monterrey";
 final public static String America_Montevideo = "America/Montevideo";
 final public static String America_Montreal = "America/Montreal";
 final public static String America_Montserrat = "America/Montserrat";
 final public static String America_Nassau = "America/Nassau";
 final public static String America_New_York = "America/New_York";
 final public static String America_Nipigon = "America/Nipigon";
 final public static String America_Nome = "America/Nome";
 final public static String America_Noronha = "America/Noronha";
 final public static String America_North_Dakota_Beulah = "America/North_Dakota/Beulah";
 final public static String America_North_Dakota_Center = "America/North_Dakota/Center";
 final public static String America_North_Dakota_New_Salem = "America/North_Dakota/New_Salem";
 final public static String America_Ojinaga = "America/Ojinaga";
 final public static String America_Panama = "America/Panama";
 final public static String America_Pangnirtung = "America/Pangnirtung";
 final public static String America_Paramaribo = "America/Paramaribo";
 final public static String America_Phoenix = "America/Phoenix";
 final public static String America_Port_au_Prince = "America/Port-au-Prince";
 final public static String America_Port_of_Spain = "America/Port_of_Spain";
 final public static String America_Porto_Acre = "America/Porto_Acre";
 final public static String America_Porto_Velho = "America/Porto_Velho";
 final public static String America_Puerto_Rico = "America/Puerto_Rico";
 final public static String America_Punta_Arenas = "America/Punta_Arenas";
 final public static String America_Rainy_River = "America/Rainy_River";
 final public static String America_Rankin_Inlet = "America/Rankin_Inlet";
 final public static String America_Recife = "America/Recife";
 final public static String America_Regina = "America/Regina";
 final public static String America_Resolute = "America/Resolute";
 final public static String America_Rio_Branco = "America/Rio_Branco";
 final public static String America_Rosario = "America/Rosario";
 final public static String America_Santa_Isabel = "America/Santa_Isabel";
 final public static String America_Santarem = "America/Santarem";
 final public static String America_Santiago = "America/Santiago";
 final public static String America_Santo_Domingo = "America/Santo_Domingo";
 final public static String America_Sao_Paulo = "America/Sao_Paulo";
 final public static String America_Scoresbysund = "America/Scoresbysund";
 final public static String America_Shiprock = "America/Shiprock";
 final public static String America_Sitka = "America/Sitka";
 final public static String America_St_Barthelemy = "America/St_Barthelemy";
 final public static String America_St_Johns = "America/St_Johns";
 final public static String America_St_Kitts = "America/St_Kitts";
 final public static String America_St_Lucia = "America/St_Lucia";
 final public static String America_St_Thomas = "America/St_Thomas";
 final public static String America_St_Vincent = "America/St_Vincent";
 final public static String America_Swift_Current = "America/Swift_Current";
 final public static String America_Tegucigalpa = "America/Tegucigalpa";
 final public static String America_Thule = "America/Thule";
 final public static String America_Thunder_Bay = "America/Thunder_Bay";
 final public static String America_Tijuana = "America/Tijuana";
 final public static String America_Toronto = "America/Toronto";
 final public static String America_Tortola = "America/Tortola";
 final public static String America_Vancouver = "America/Vancouver";
 final public static String America_Virgin = "America/Virgin";
 final public static String America_Whitehorse = "America/Whitehorse";
 final public static String America_Winnipeg = "America/Winnipeg";
 final public static String America_Yakutat = "America/Yakutat";
 final public static String America_Yellowknife = "America/Yellowknife";
 final public static String Antarctica_Casey = "Antarctica/Casey";
 final public static String Antarctica_Davis = "Antarctica/Davis";
 final public static String Antarctica_DumontDUrville = "Antarctica/DumontDUrville";
 final public static String Antarctica_Macquarie = "Antarctica/Macquarie";
 final public static String Antarctica_Mawson = "Antarctica/Mawson";
 final public static String Antarctica_McMurdo = "Antarctica/McMurdo";
 final public static String Antarctica_Palmer = "Antarctica/Palmer";
 final public static String Antarctica_Rothera = "Antarctica/Rothera";
 final public static String Antarctica_South_Pole = "Antarctica/South_Pole";
 final public static String Antarctica_Syowa = "Antarctica/Syowa";
 final public static String Antarctica_Troll = "Antarctica/Troll";
 final public static String Antarctica_Vostok = "Antarctica/Vostok";
 final public static String Arctic_Longyearbyen = "Arctic/Longyearbyen";
 final public static String Asia_Aden = "Asia/Aden";
 final public static String Asia_Almaty = "Asia/Almaty";
 final public static String Asia_Amman = "Asia/Amman";
 final public static String Asia_Anadyr = "Asia/Anadyr";
 final public static String Asia_Aqtau = "Asia/Aqtau";
 final public static String Asia_Aqtobe = "Asia/Aqtobe";
 final public static String Asia_Ashgabat = "Asia/Ashgabat";
 final public static String Asia_Ashkhabad = "Asia/Ashkhabad";
 final public static String Asia_Atyrau = "Asia/Atyrau";
 final public static String Asia_Baghdad = "Asia/Baghdad";
 final public static String Asia_Bahrain = "Asia/Bahrain";
 final public static String Asia_Baku = "Asia/Baku";
 final public static String Asia_Bangkok = "Asia/Bangkok";
 final public static String Asia_Barnaul = "Asia/Barnaul";
 final public static String Asia_Beirut = "Asia/Beirut";
 final public static String Asia_Bishkek = "Asia/Bishkek";
 final public static String Asia_Brunei = "Asia/Brunei";
 final public static String Asia_Calcutta = "Asia/Calcutta";
 final public static String Asia_Chita = "Asia/Chita";
 final public static String Asia_Choibalsan = "Asia/Choibalsan";
 final public static String Asia_Chongqing = "Asia/Chongqing";
 final public static String Asia_Chungking = "Asia/Chungking";
 final public static String Asia_Colombo = "Asia/Colombo";
 final public static String Asia_Dacca = "Asia/Dacca";
 final public static String Asia_Damascus = "Asia/Damascus";
 final public static String Asia_Dhaka = "Asia/Dhaka";
 final public static String Asia_Dili = "Asia/Dili";
 final public static String Asia_Dubai = "Asia/Dubai";
 final public static String Asia_Dushanbe = "Asia/Dushanbe";
 final public static String Asia_Famagusta = "Asia/Famagusta";
 final public static String Asia_Gaza = "Asia/Gaza";
 final public static String Asia_Harbin = "Asia/Harbin";
 final public static String Asia_Hebron = "Asia/Hebron";
 final public static String Asia_Ho_Chi_Minh = "Asia/Ho_Chi_Minh";
 final public static String Asia_Hong_Kong = "Asia/Hong_Kong";
 final public static String Asia_Hovd = "Asia/Hovd";
 final public static String Asia_Irkutsk = "Asia/Irkutsk";
 final public static String Asia_Istanbul = "Asia/Istanbul";
 final public static String Asia_Jakarta = "Asia/Jakarta";
 final public static String Asia_Jayapura = "Asia/Jayapura";
 final public static String Asia_Jerusalem = "Asia/Jerusalem";
 final public static String Asia_Kabul = "Asia/Kabul";
 final public static String Asia_Kamchatka = "Asia/Kamchatka";
 final public static String Asia_Karachi = "Asia/Karachi";
 final public static String Asia_Kashgar = "Asia/Kashgar";
 final public static String Asia_Kathmandu = "Asia/Kathmandu";
 final public static String Asia_Katmandu = "Asia/Katmandu";
 final public static String Asia_Khandyga = "Asia/Khandyga";
 final public static String Asia_Kolkata = "Asia/Kolkata";
 final public static String Asia_Krasnoyarsk = "Asia/Krasnoyarsk";
 final public static String Asia_Kuala_Lumpur = "Asia/Kuala_Lumpur";
 final public static String Asia_Kuching = "Asia/Kuching";
 final public static String Asia_Kuwait = "Asia/Kuwait";
 final public static String Asia_Macao = "Asia/Macao";
 final public static String Asia_Macau = "Asia/Macau";
 final public static String Asia_Magadan = "Asia/Magadan";
 final public static String Asia_Makassar = "Asia/Makassar";
 final public static String Asia_Manila = "Asia/Manila";
 final public static String Asia_Muscat = "Asia/Muscat";
 final public static String Asia_Nicosia = "Asia/Nicosia";
 final public static String Asia_Novokuznetsk = "Asia/Novokuznetsk";
 final public static String Asia_Novosibirsk = "Asia/Novosibirsk";
 final public static String Asia_Omsk = "Asia/Omsk";
 final public static String Asia_Oral = "Asia/Oral";
 final public static String Asia_Phnom_Penh = "Asia/Phnom_Penh";
 final public static String Asia_Pontianak = "Asia/Pontianak";
 final public static String Asia_Pyongyang = "Asia/Pyongyang";
 final public static String Asia_Qatar = "Asia/Qatar";
 final public static String Asia_Qyzylorda = "Asia/Qyzylorda";
 final public static String Asia_Rangoon = "Asia/Rangoon";
 final public static String Asia_Riyadh = "Asia/Riyadh";
 final public static String Asia_Saigon = "Asia/Saigon";
 final public static String Asia_Sakhalin = "Asia/Sakhalin";
 final public static String Asia_Samarkand = "Asia/Samarkand";
 final public static String Asia_Seoul = "Asia/Seoul";
 final public static String Asia_Shanghai = "Asia/Shanghai";
 final public static String Asia_Singapore = "Asia/Singapore";
 final public static String Asia_Srednekolymsk = "Asia/Srednekolymsk";
 final public static String Asia_Taipei = "Asia/Taipei";
 final public static String Asia_Tashkent = "Asia/Tashkent";
 final public static String Asia_Tbilisi = "Asia/Tbilisi";
 final public static String Asia_Tehran = "Asia/Tehran";
 final public static String Asia_Tel_Aviv = "Asia/Tel_Aviv";
 final public static String Asia_Thimbu = "Asia/Thimbu";
 final public static String Asia_Thimphu = "Asia/Thimphu";
 final public static String Asia_Tokyo = "Asia/Tokyo";
 final public static String Asia_Tomsk = "Asia/Tomsk";
 final public static String Asia_Ujung_Pandang = "Asia/Ujung_Pandang";
 final public static String Asia_Ulaanbaatar = "Asia/Ulaanbaatar";
 final public static String Asia_Ulan_Bator = "Asia/Ulan_Bator";
 final public static String Asia_Urumqi = "Asia/Urumqi";
 final public static String Asia_Ust_Nera = "Asia/Ust-Nera";
 final public static String Asia_Vientiane = "Asia/Vientiane";
 final public static String Asia_Vladivostok = "Asia/Vladivostok";
 final public static String Asia_Yakutsk = "Asia/Yakutsk";
 final public static String Asia_Yangon = "Asia/Yangon";
 final public static String Asia_Yekaterinburg = "Asia/Yekaterinburg";
 final public static String Asia_Yerevan = "Asia/Yerevan";
 final public static String Atlantic_Azores = "Atlantic/Azores";
 final public static String Atlantic_Bermuda = "Atlantic/Bermuda";
 final public static String Atlantic_Canary = "Atlantic/Canary";
 final public static String Atlantic_Cape_Verde = "Atlantic/Cape_Verde";
 final public static String Atlantic_Faeroe = "Atlantic/Faeroe";
 final public static String Atlantic_Faroe = "Atlantic/Faroe";
 final public static String Atlantic_Jan_Mayen = "Atlantic/Jan_Mayen";
 final public static String Atlantic_Madeira = "Atlantic/Madeira";
 final public static String Atlantic_Reykjavik = "Atlantic/Reykjavik";
 final public static String Atlantic_South_Georgia = "Atlantic/South_Georgia";
 final public static String Atlantic_St_Helena = "Atlantic/St_Helena";
 final public static String Atlantic_Stanley = "Atlantic/Stanley";
 final public static String Australia_ACT = "Australia/ACT";
 final public static String Australia_Adelaide = "Australia/Adelaide";
 final public static String Australia_Brisbane = "Australia/Brisbane";
 final public static String Australia_Broken_Hill = "Australia/Broken_Hill";
 final public static String Australia_Canberra = "Australia/Canberra";
 final public static String Australia_Currie = "Australia/Currie";
 final public static String Australia_Darwin = "Australia/Darwin";
 final public static String Australia_Eucla = "Australia/Eucla";
 final public static String Australia_Hobart = "Australia/Hobart";
 final public static String Australia_LHI = "Australia/LHI";
 final public static String Australia_Lindeman = "Australia/Lindeman";
 final public static String Australia_Lord_Howe = "Australia/Lord_Howe";
 final public static String Australia_Melbourne = "Australia/Melbourne";
 final public static String Australia_NSW = "Australia/NSW";
 final public static String Australia_North = "Australia/North";
 final public static String Australia_Perth = "Australia/Perth";
 final public static String Australia_Queensland = "Australia/Queensland";
 final public static String Australia_South = "Australia/South";
 final public static String Australia_Sydney = "Australia/Sydney";
 final public static String Australia_Tasmania = "Australia/Tasmania";
 final public static String Australia_Victoria = "Australia/Victoria";
 final public static String Australia_West = "Australia/West";
 final public static String Australia_Yancowinna = "Australia/Yancowinna";
 final public static String Brazil_Acre = "Brazil/Acre";
 final public static String Brazil_DeNoronha = "Brazil/DeNoronha";
 final public static String Brazil_East = "Brazil/East";
 final public static String Brazil_West = "Brazil/West";
 final public static String CET = "CET";
 final public static String CST6CDT = "CST6CDT";
 final public static String Canada_Atlantic = "Canada/Atlantic";
 final public static String Canada_Central = "Canada/Central";
 final public static String Canada_Eastern = "Canada/Eastern";
 final public static String Canada_Mountain = "Canada/Mountain";
 final public static String Canada_Newfoundland = "Canada/Newfoundland";
 final public static String Canada_Pacific = "Canada/Pacific";
 final public static String Canada_Saskatchewan = "Canada/Saskatchewan";
 final public static String Canada_Yukon = "Canada/Yukon";
 final public static String Chile_Continental = "Chile/Continental";
 final public static String Chile_EasterIsland = "Chile/EasterIsland";
 final public static String Cuba = "Cuba";
 final public static String EET = "EET";
 final public static String EST5EDT = "EST5EDT";
 final public static String Egypt = "Egypt";
 final public static String Eire = "Eire";
 final public static String Etc_GMT = "Etc/GMT";
 final public static String Etc_GMT__0 = "Etc/GMT+0";
 final public static String Etc_GMT__1 = "Etc/GMT+1";
 final public static String Etc_GMT__10 = "Etc/GMT+10";
 final public static String Etc_GMT__11 = "Etc/GMT+11";
 final public static String Etc_GMT__12 = "Etc/GMT+12";
 final public static String Etc_GMT__2 = "Etc/GMT+2";
 final public static String Etc_GMT__3 = "Etc/GMT+3";
 final public static String Etc_GMT__4 = "Etc/GMT+4";
 final public static String Etc_GMT__5 = "Etc/GMT+5";
 final public static String Etc_GMT__6 = "Etc/GMT+6";
 final public static String Etc_GMT__7 = "Etc/GMT+7";
 final public static String Etc_GMT__8 = "Etc/GMT+8";
 final public static String Etc_GMT__9 = "Etc/GMT+9";
 final public static String Etc_GMT_0 = "Etc/GMT-0";
 final public static String Etc_GMT_1 = "Etc/GMT-1";
 final public static String Etc_GMT_10 = "Etc/GMT-10";
 final public static String Etc_GMT_11 = "Etc/GMT-11";
 final public static String Etc_GMT_12 = "Etc/GMT-12";
 final public static String Etc_GMT_13 = "Etc/GMT-13";
 final public static String Etc_GMT_14 = "Etc/GMT-14";
 final public static String Etc_GMT_2 = "Etc/GMT-2";
 final public static String Etc_GMT_3 = "Etc/GMT-3";
 final public static String Etc_GMT_4 = "Etc/GMT-4";
 final public static String Etc_GMT_5 = "Etc/GMT-5";
 final public static String Etc_GMT_6 = "Etc/GMT-6";
 final public static String Etc_GMT_7 = "Etc/GMT-7";
 final public static String Etc_GMT_8 = "Etc/GMT-8";
 final public static String Etc_GMT_9 = "Etc/GMT-9";
 final public static String Etc_GMT0 = "Etc/GMT0";
 final public static String Etc_Greenwich = "Etc/Greenwich";
 final public static String Etc_UCT = "Etc/UCT";
 final public static String Etc_UTC = "Etc/UTC";
 final public static String Etc_Universal = "Etc/Universal";
 final public static String Etc_Zulu = "Etc/Zulu";
 final public static String Europe_Amsterdam = "Europe/Amsterdam";
 final public static String Europe_Andorra = "Europe/Andorra";
 final public static String Europe_Astrakhan = "Europe/Astrakhan";
 final public static String Europe_Athens = "Europe/Athens";
 final public static String Europe_Belfast = "Europe/Belfast";
 final public static String Europe_Belgrade = "Europe/Belgrade";
 final public static String Europe_Berlin = "Europe/Berlin";
 final public static String Europe_Bratislava = "Europe/Bratislava";
 final public static String Europe_Brussels = "Europe/Brussels";
 final public static String Europe_Bucharest = "Europe/Bucharest";
 final public static String Europe_Budapest = "Europe/Budapest";
 final public static String Europe_Busingen = "Europe/Busingen";
 final public static String Europe_Chisinau = "Europe/Chisinau";
 final public static String Europe_Copenhagen = "Europe/Copenhagen";
 final public static String Europe_Dublin = "Europe/Dublin";
 final public static String Europe_Gibraltar = "Europe/Gibraltar";
 final public static String Europe_Guernsey = "Europe/Guernsey";
 final public static String Europe_Helsinki = "Europe/Helsinki";
 final public static String Europe_Isle_of_Man = "Europe/Isle_of_Man";
 final public static String Europe_Istanbul = "Europe/Istanbul";
 final public static String Europe_Jersey = "Europe/Jersey";
 final public static String Europe_Kaliningrad = "Europe/Kaliningrad";
 final public static String Europe_Kiev = "Europe/Kiev";
 final public static String Europe_Kirov = "Europe/Kirov";
 final public static String Europe_Lisbon = "Europe/Lisbon";
 final public static String Europe_Ljubljana = "Europe/Ljubljana";
 final public static String Europe_London = "Europe/London";
 final public static String Europe_Luxembourg = "Europe/Luxembourg";
 final public static String Europe_Madrid = "Europe/Madrid";
 final public static String Europe_Malta = "Europe/Malta";
 final public static String Europe_Mariehamn = "Europe/Mariehamn";
 final public static String Europe_Minsk = "Europe/Minsk";
 final public static String Europe_Monaco = "Europe/Monaco";
 final public static String Europe_Moscow = "Europe/Moscow";
 final public static String Europe_Nicosia = "Europe/Nicosia";
 final public static String Europe_Oslo = "Europe/Oslo";
 final public static String Europe_Paris = "Europe/Paris";
 final public static String Europe_Podgorica = "Europe/Podgorica";
 final public static String Europe_Prague = "Europe/Prague";
 final public static String Europe_Riga = "Europe/Riga";
 final public static String Europe_Rome = "Europe/Rome";
 final public static String Europe_Samara = "Europe/Samara";
 final public static String Europe_San_Marino = "Europe/San_Marino";
 final public static String Europe_Sarajevo = "Europe/Sarajevo";
 final public static String Europe_Saratov = "Europe/Saratov";
 final public static String Europe_Simferopol = "Europe/Simferopol";
 final public static String Europe_Skopje = "Europe/Skopje";
 final public static String Europe_Sofia = "Europe/Sofia";
 final public static String Europe_Stockholm = "Europe/Stockholm";
 final public static String Europe_Tallinn = "Europe/Tallinn";
 final public static String Europe_Tirane = "Europe/Tirane";
 final public static String Europe_Tiraspol = "Europe/Tiraspol";
 final public static String Europe_Ulyanovsk = "Europe/Ulyanovsk";
 final public static String Europe_Uzhgorod = "Europe/Uzhgorod";
 final public static String Europe_Vaduz = "Europe/Vaduz";
 final public static String Europe_Vatican = "Europe/Vatican";
 final public static String Europe_Vienna = "Europe/Vienna";
 final public static String Europe_Vilnius = "Europe/Vilnius";
 final public static String Europe_Volgograd = "Europe/Volgograd";
 final public static String Europe_Warsaw = "Europe/Warsaw";
 final public static String Europe_Zagreb = "Europe/Zagreb";
 final public static String Europe_Zaporozhye = "Europe/Zaporozhye";
 final public static String Europe_Zurich = "Europe/Zurich";
 final public static String GB = "GB";
 final public static String GB_Eire = "GB-Eire";
 final public static String GMT = "GMT";
 final public static String GMT0 = "GMT0";
 final public static String Greenwich = "Greenwich";
 final public static String Hongkong = "Hongkong";
 final public static String Iceland = "Iceland";
 final public static String Indian_Antananarivo = "Indian/Antananarivo";
 final public static String Indian_Chagos = "Indian/Chagos";
 final public static String Indian_Christmas = "Indian/Christmas";
 final public static String Indian_Cocos = "Indian/Cocos";
 final public static String Indian_Comoro = "Indian/Comoro";
 final public static String Indian_Kerguelen = "Indian/Kerguelen";
 final public static String Indian_Mahe = "Indian/Mahe";
 final public static String Indian_Maldives = "Indian/Maldives";
 final public static String Indian_Mauritius = "Indian/Mauritius";
 final public static String Indian_Mayotte = "Indian/Mayotte";
 final public static String Indian_Reunion = "Indian/Reunion";
 final public static String Iran = "Iran";
 final public static String Israel = "Israel";
 final public static String Jamaica = "Jamaica";
 final public static String Japan = "Japan";
 final public static String Kwajalein = "Kwajalein";
 final public static String Libya = "Libya";
 final public static String MET = "MET";
 final public static String MST7MDT = "MST7MDT";
 final public static String Mexico_BajaNorte = "Mexico/BajaNorte";
 final public static String Mexico_BajaSur = "Mexico/BajaSur";
 final public static String Mexico_General = "Mexico/General";
 final public static String NZ = "NZ";
 final public static String NZ_CHAT = "NZ-CHAT";
 final public static String Navajo = "Navajo";
 final public static String PRC = "PRC";
 final public static String PST8PDT = "PST8PDT";
 final public static String Pacific_Apia = "Pacific/Apia";
 final public static String Pacific_Auckland = "Pacific/Auckland";
 final public static String Pacific_Bougainville = "Pacific/Bougainville";
 final public static String Pacific_Chatham = "Pacific/Chatham";
 final public static String Pacific_Chuuk = "Pacific/Chuuk";
 final public static String Pacific_Easter = "Pacific/Easter";
 final public static String Pacific_Efate = "Pacific/Efate";
 final public static String Pacific_Enderbury = "Pacific/Enderbury";
 final public static String Pacific_Fakaofo = "Pacific/Fakaofo";
 final public static String Pacific_Fiji = "Pacific/Fiji";
 final public static String Pacific_Funafuti = "Pacific/Funafuti";
 final public static String Pacific_Galapagos = "Pacific/Galapagos";
 final public static String Pacific_Gambier = "Pacific/Gambier";
 final public static String Pacific_Guadalcanal = "Pacific/Guadalcanal";
 final public static String Pacific_Guam = "Pacific/Guam";
 final public static String Pacific_Honolulu = "Pacific/Honolulu";
 final public static String Pacific_Johnston = "Pacific/Johnston";
 final public static String Pacific_Kiritimati = "Pacific/Kiritimati";
 final public static String Pacific_Kosrae = "Pacific/Kosrae";
 final public static String Pacific_Kwajalein = "Pacific/Kwajalein";
 final public static String Pacific_Majuro = "Pacific/Majuro";
 final public static String Pacific_Marquesas = "Pacific/Marquesas";
 final public static String Pacific_Midway = "Pacific/Midway";
 final public static String Pacific_Nauru = "Pacific/Nauru";
 final public static String Pacific_Niue = "Pacific/Niue";
 final public static String Pacific_Norfolk = "Pacific/Norfolk";
 final public static String Pacific_Noumea = "Pacific/Noumea";
 final public static String Pacific_Pago_Pago = "Pacific/Pago_Pago";
 final public static String Pacific_Palau = "Pacific/Palau";
 final public static String Pacific_Pitcairn = "Pacific/Pitcairn";
 final public static String Pacific_Pohnpei = "Pacific/Pohnpei";
 final public static String Pacific_Ponape = "Pacific/Ponape";
 final public static String Pacific_Port_Moresby = "Pacific/Port_Moresby";
 final public static String Pacific_Rarotonga = "Pacific/Rarotonga";
 final public static String Pacific_Saipan = "Pacific/Saipan";
 final public static String Pacific_Samoa = "Pacific/Samoa";
 final public static String Pacific_Tahiti = "Pacific/Tahiti";
 final public static String Pacific_Tarawa = "Pacific/Tarawa";
 final public static String Pacific_Tongatapu = "Pacific/Tongatapu";
 final public static String Pacific_Truk = "Pacific/Truk";
 final public static String Pacific_Wake = "Pacific/Wake";
 final public static String Pacific_Wallis = "Pacific/Wallis";
 final public static String Pacific_Yap = "Pacific/Yap";
 final public static String Poland = "Poland";
 final public static String Portugal = "Portugal";
 final public static String ROK = "ROK";
 final public static String Singapore = "Singapore";
 final public static String SystemV_AST4 = "SystemV/AST4";
 final public static String SystemV_AST4ADT = "SystemV/AST4ADT";
 final public static String SystemV_CST6 = "SystemV/CST6";
 final public static String SystemV_CST6CDT = "SystemV/CST6CDT";
 final public static String SystemV_EST5 = "SystemV/EST5";
 final public static String SystemV_EST5EDT = "SystemV/EST5EDT";
 final public static String SystemV_HST10 = "SystemV/HST10";
 final public static String SystemV_MST7 = "SystemV/MST7";
 final public static String SystemV_MST7MDT = "SystemV/MST7MDT";
 final public static String SystemV_PST8 = "SystemV/PST8";
 final public static String SystemV_PST8PDT = "SystemV/PST8PDT";
 final public static String SystemV_YST9 = "SystemV/YST9";
 final public static String SystemV_YST9YDT = "SystemV/YST9YDT";
 final public static String Turkey = "Turkey";
 final public static String UCT = "UCT";
 final public static String US_Alaska = "US/Alaska";
 final public static String US_Aleutian = "US/Aleutian";
 final public static String US_Arizona = "US/Arizona";
 final public static String US_Central = "US/Central";
 final public static String US_East_Indiana = "US/East-Indiana";
 final public static String US_Eastern = "US/Eastern";
 final public static String US_Hawaii = "US/Hawaii";
 final public static String US_Indiana_Starke = "US/Indiana-Starke";
 final public static String US_Michigan = "US/Michigan";
 final public static String US_Mountain = "US/Mountain";
 final public static String US_Pacific = "US/Pacific";
 final public static String US_Pacific_New = "US/Pacific-New";
 final public static String US_Samoa = "US/Samoa";
 final public static String UTC = "UTC";
 final public static String Universal = "Universal";
 final public static String W_SU = "W-SU";
 final public static String WET = "WET";
 final public static String Zulu = "Zulu";
 final public static String EST = "EST";
 final public static String HST = "HST";
 final public static String MST = "MST";
 final public static String ACT = "ACT";
 final public static String AET = "AET";
 final public static String AGT = "AGT";
 final public static String ART = "ART";
 final public static String AST = "AST";
 final public static String BET = "BET";
 final public static String BST = "BST";
 final public static String CAT = "CAT";
 final public static String CNT = "CNT";
 final public static String CST = "CST";
 final public static String CTT = "CTT";
 final public static String EAT = "EAT";
 final public static String ECT = "ECT";
 final public static String IET = "IET";
 final public static String IST = "IST";
 final public static String JST = "JST";
 final public static String MIT = "MIT";
 final public static String NET = "NET";
 final public static String NST = "NST";
 final public static String PLT = "PLT";
 final public static String PNT = "PNT";
 final public static String PRT = "PRT";
 final public static String PST = "PST";
 final public static String SST = "SST";
 final public static String VST = "VST";
 
 TimeZone[] list=new TimeZone[TimeZone.getAvailableIDs().length];

 public TimeZone[] timeZone(){
	 for(int i=0;i<TimeZone.getAvailableIDs().length;i++) {
		 String s=TimeZone.getAvailableIDs()[i];
		 TimeZone t1=TimeZone.getTimeZone(s);
		 list[i]=t1;
      }
 	 
	 
	return list;

 }
 
 
  public TimeZone timeZone(String id) {
	  return TimeZone.getTimeZone(id);
  }	 
  
  public static int day_of_week,
      day_of_month,
      day_of_year,
      maximum_weak_in_month,
      maximum_weak_in_year,
      maximum_no_of_day_in_year,
      minimum_no_of_day_in_year,
      maximum_no_of_day_in_month,
      minimum_no_of_day_in_month,
      minimum_date_of_week,
      maximum_date_of_week,
      minimum_dateName_of_week,
      maximum_dateName_of_week,
      minimum_dateName_of_month,
      maximum_dateName_of_month,
      minimum_dateName_of_year,
      maximum_dateName_of_year,

      era,
      AM_PM;
  boolean leap_year;
  
  
  public Date() {
	  set();
  }
  
  long timemill;

  public void set() {

	  Calendar c= Calendar.getInstance();
	  timemill=c.getTimeInMillis();
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      

  }
  public long getTime() {
	  return timemill;
  }
  
  public static int no_of_days(Date sc,Date ec) {
         long s=(ec.getTime()-sc.getTime())/86400000;
	    	return (int)s;
  }
  
  public void set(int years,int months,int dates,int hours,int minutes,int seconds,int millis,double ams) {

	  Calendar c= Calendar.getInstance();
	  c.set(Calendar.YEAR, years);
	  c.set(Calendar.MONTH, months);
	  c.set(Calendar.DATE, dates);
	  c.set(Calendar.HOUR, hours);
	  c.set(Calendar.MINUTE, minutes);
	  c.set(Calendar.SECOND, seconds);
	  c.set(Calendar.MILLISECOND, millis);
	  c.set(Calendar.AM_PM,(int) ams);
	
	  timemill=c.getTimeInMillis();

	  
	 
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  public void set(int year,int month,int dates,int hour,int minute,int second,int milli,TimeZone t,Locale l) {

	  Calendar c= Calendar.getInstance(t,l);
	  c.set(Calendar.YEAR, year);
	  c.set(Calendar.MONTH, month);
	  c.set(Calendar.DATE, dates);
	  c.set(Calendar.HOUR, hour);
	  c.set(Calendar.MINUTE, minute);
	  c.set(Calendar.SECOND, second);
	  c.set(Calendar.MILLISECOND, milli);
	
	  timemill=c.getTimeInMillis();

	  
	 
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  
  
  public void set(int year,int month,int dates,int hour,int minute,int second,int milli,double ams,TimeZone t,Locale l) {

	  Calendar c= Calendar.getInstance(t,l);
	  c.set(Calendar.YEAR, year);
	  c.set(Calendar.MONTH, month);
	  c.set(Calendar.DATE, dates);
	  c.set(Calendar.HOUR, hour);
	  c.set(Calendar.MINUTE, minute);
	  c.set(Calendar.SECOND, second);
	  c.set(Calendar.MILLISECOND, milli);
	  c.set(Calendar.AM_PM, (int)ams);
	  
	  timemill=c.getTimeInMillis();

	 
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  
  
  
  public void set(int years) {

	  Calendar c= Calendar.getInstance();
	  c.set(Calendar.YEAR, years);
	
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  public void set(int years,int months,int dates) {

	  Calendar c= Calendar.getInstance();
	  c.set(Calendar.YEAR, years);
	  c.set(Calendar.MONTH, months);
	  c.set(Calendar.DATE, dates);
	
	
timemill=c.getTimeInMillis();
	  
	 
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  
  public void set(int years,int months) {

	  Calendar c= Calendar.getInstance();
	  c.set(Calendar.YEAR, years);
	  c.set(Calendar.MONTH, months);
	 
	  
	  
	 
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  
  public void set(int years,int months,int datess,int hours,double ams) {

	  Calendar c= Calendar.getInstance();
	  c.set(Calendar.YEAR, years);
	  c.set(Calendar.MONTH, months);
	  c.set(Calendar.DATE, datess);
	  c.set(Calendar.HOUR, hours);
	  c.set(Calendar.AM_PM, (int)ams);
	
	  
	  timemill=c.getTimeInMillis();
 
	 
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  
  public void set(int years,int months,int datess,int hours,int minutes,double ams) {

	  Calendar c= Calendar.getInstance();
	  c.set(Calendar.YEAR, years);
	  c.set(Calendar.MONTH, months);
	  c.set(Calendar.DATE, datess);
	  c.set(Calendar.HOUR, hours);
	  c.set(Calendar.MINUTE, minutes);
	  c.set(Calendar.AM_PM,(int) ams);
	  	
	  timemill=c.getTimeInMillis();

	  
	 
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  
  public void set(int years,int months,int dates,int hours,int minutes,int seconds) {

	  Calendar c= Calendar.getInstance();
	  c.set(Calendar.YEAR, years);
	  c.set(Calendar.MONTH, months);
	  c.set(Calendar.DATE, dates);
	  c.set(Calendar.HOUR, hours);
	  c.set(Calendar.MINUTE, minutes);
	  c.set(Calendar.SECOND, seconds);
	
	  
	  timemill=c.getTimeInMillis();

	 
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  
  public void set(int years,int months,int dates,int hours,int minutes,int seconds,double am) {

	  Calendar c= Calendar.getInstance();
	  c.set(Calendar.YEAR, years);
	  c.set(Calendar.MONTH, months);
	  c.set(Calendar.DATE, dates);
	  c.set(Calendar.HOUR, hours);
	  c.set(Calendar.MINUTE, minutes);
	  c.set(Calendar.SECOND, seconds);
	  c.set(Calendar.AM_PM, (int)am);
	
	  timemill=c.getTimeInMillis();

	  
	 
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	

  }
  
  
  
  
  public void set(TimeZone t) {

	  Calendar c= Calendar.getInstance(t);
	  timemill=c.getTimeInMillis();
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      

  }
  
  
  public Date(TimeZone t) {
	  set(t);
  }
  
  public Date(Locale l) {
	  set(l);
  }
  public Date(TimeZone t,Locale l) {
	  set(t,l);
  }
  
  
  public void set(Locale l) {

	  Calendar c= Calendar.getInstance(l);
	  timemill=c.getTimeInMillis();
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      

  }
  
  
  public Date(int year,int m,int dates) {
	  set(year,m,dates);
  }
  
  public void set(TimeZone t,Locale l) {

	  Calendar c= Calendar.getInstance(t,l);
	  timemill=c.getTimeInMillis();
	  year=c.get(Calendar.YEAR);
	  month=c.get(Calendar.MONTH);
	  date = c.get(Calendar.DATE);
	  hour = c.get(Calendar.HOUR);
	  minute=c.get(Calendar.MINUTE);
	  second=c.get(Calendar.SECOND);
	  millisecond=c.get(Calendar.MILLISECOND);
	  timeZone=TimeZone.getDefault();
	  day_of_week=c.get(Calendar.DAY_OF_WEEK);
	  AM_PM=c.get(Calendar.AM_PM);
	  maximum_weak_in_month=c.getActualMaximum(Calendar.WEEK_OF_MONTH);
	  maximum_weak_in_year=c.getActualMaximum(Calendar.WEEK_OF_YEAR);
      maximum_no_of_day_in_year=c.getActualMaximum(Calendar.DAY_OF_YEAR);
      minimum_no_of_day_in_year=c.getActualMinimum(Calendar.DAY_OF_YEAR);
      maximum_no_of_day_in_month=c.getActualMaximum(Calendar.DAY_OF_MONTH);
      minimum_no_of_day_in_month=c.getActualMinimum(Calendar.DAY_OF_MONTH);
    
      no_of_week_in_month=c.get(Calendar.WEEK_OF_MONTH);
	  no_of_week_in_year =c.get(Calendar.WEEK_OF_YEAR);  
	  era=c.get(Calendar.ERA);
      no_of_day_in_year=c.get(Calendar.DAY_OF_YEAR);
  
      
      int date=c.get(Calendar.DATE);
      int day_of_week=c.get(Calendar.DAY_OF_WEEK);
      minimum_date_of_week=date-(day_of_week-1);
      maximum_date_of_week=date+(7-day_of_week);
      c.set(Calendar.DATE, minimum_date_of_week);
      minimum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      c.set(Calendar.DATE, maximum_date_of_week);
      maximum_dateName_of_week=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.DATE, minimum_no_of_day_in_month);
      minimum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.DATE, maximum_no_of_day_in_month);
      maximum_dateName_of_month=c.get(Calendar.DAY_OF_WEEK);
      
      c.set(Calendar.MONTH, 0);
      c.set(Calendar.DATE, minimum_no_of_day_in_year);
      minimum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      c.set(Calendar.MONTH, 11);
      c.set(Calendar.DATE, 31);
      maximum_dateName_of_year=c.get(Calendar.DAY_OF_WEEK);
    	
      

  }
  
  
  @Override
public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("Good "+dayDivision() +" Respectfull,Wonderfull,Peacefull organisms =>>>>>.....\n");
	s.append("Date     = "+date+"-"+(month+1)+"-"+year+"\n");
	s.append("Time     = "+hour+":"+minute+":"+second+":"+millisecond+" "+am_pm(AM_PM));
	s.append("\nTimeZone = "+timeZone.getID());
	s.append("\nSunlight = "+dayDivision());
	s.append("\nDay      = "+dayName(day_of_week));
	s.append("\nMonth    = "+monthName(month));
	s.append("\nWeek:=>>\n");
	s.append("Present no of week in month = "+no_of_week_in_month);
	s.append("\nMaximum no of week in month = "+maximum_weak_in_month);
	s.append("\nPresent no of week in year = "+no_of_week_in_year);
	s.append("\nMaximum no of week in year = "+maximum_weak_in_year);
	s.append("\nStart of present week  = "+minimum_date_of_week +","+dayName(minimum_dateName_of_week));
	s.append("\nEnd of present week    = "+maximum_date_of_week +","+dayName(maximum_dateName_of_week));
	
	s.append("\nMonth :=>>");
	s.append("\nMinimum day in month = "+minimum_no_of_day_in_month +","+dayName(minimum_dateName_of_month));
	s.append("\nMaximum day in month = "+maximum_no_of_day_in_month +","+dayName(maximum_dateName_of_month));
	
	s.append("\nLeap Year = "+leapYear(no_of_week_in_year));
	s.append("\nDay :=>>\n");
	s.append("No of day in year   = "+no_of_day_in_year);
	s.append("\nMinimum day in year = "+minimum_no_of_day_in_year+","+dayName(minimum_dateName_of_year));
	s.append("\nMaximum day in year = "+maximum_no_of_day_in_year+","+dayName(maximum_dateName_of_year));
	s.append("\nLeap Year = "+leapYear(no_of_week_in_year));
	s.append("\nEra = "+era);
	

	
	
	
	return s.toString();
	
	
}

public static int light;
public static boolean leapYear(int year) {
	   Calendar c=Calendar.getInstance();
	   c.set(Calendar.YEAR, year);
	   if(c.getActualMaximum(Calendar.DAY_OF_YEAR)==366)
	   {
		   return true;
	   }else {
	   return false;
}}

public static String dayDivision() {
	
	String time=hour+"."+minute;
	Double hour=Double.parseDouble(time);
	
	if((hour>=6 && hour<=11.59) && AM_PM==0) {
		light=0;
		return "Morning";
	}
	 
	if((hour==0.0 && AM_PM==1)) {
		light=1;
		return "Noon";
	}
	//System.out.println(hour);
	if((hour>=0.1 && hour <=5 )&&(AM_PM==1))
	{
		light=2;
		
		return "AfterNoon";
	}
	
	if((hour>=5.1 && hour <=8 )&&(AM_PM==1))
	{
		light=3;
		return "Evening";
	}
	if(((hour>=8.1 && hour <=11.59 )&&(AM_PM==1))||((hour>=0 && hour <=5.59 )&&(AM_PM==0)))
	{
		light=4;
		return "Night";
	}
	

	
	
	return "nothing";

    
}
public static String dayName(int i) {
	   switch(i) {
	   case 1:return "Sunday";
	   case 2:return "Monday";
	   case 3:return "Tuesday";
	   case 4:return "Wednesday";
	   case 5:return "Thursday";
	   case 6:return "Friday";
	   case 7:return "Saturday";
	   default:return "not a day";
	   }
}

public static String am_pm(int i) {
	   switch(i) {
	   case 0:return "A.M.";
	   case 1:return "P.M";
	   default:return "not a day";
	   }
}


public static String dn(int i) {
	   switch(i) {
	   case 1:return "Sun";
	   case 2:return "Mon";
	   case 3:return "Tue";
	   case 4:return "Wed";
	   case 5:return "Thu";
	   case 6:return "Fri";
	   case 7:return "Sat";
	   default:return "not a day";
	   }
}

public static String monthName(int i) {
	   switch(i) {
	   case 0: return "January";
	   case 1: return "February";
	   case 2: return "March";
	   case 3: return "April";
	   case 4: return "May";
	   case 5: return "June";
	   case 6: return "July";
	   case 7: return "August";
	   case 8: return "September";
	   case 9: return "October";
	   case 10: return "November";
	   case 11: return "Decmeber";
	   default:return "Not a month";
	   }
}

public static String monthSN(int i) {
	   switch(i) {
	   case 0:  return "Jan";
	   case 1:  return "Feb";
	   case 2:  return "Mar";
	   case 3:  return "Apr";
	   case 4:  return "May";
	   case 5:  return "Jun";
	   case 6:  return "Jul";
	   case 7:  return "Aug";
	   case 8:  return "Sep";
	   case 9: return  "Oct";
	   case 10: return "Nov";
	   case 11: return "Dec";
	   default:return "Not a month";
	   }
}

public static int no_of_year(Date sc,Date ec) {
	   Calendar startCalendar = new GregorianCalendar();
	   startCalendar.setTimeInMillis(sc.getTime());
	   Calendar endCalendar = new GregorianCalendar();
	   endCalendar.setTimeInMillis(ec.getTime());

	   int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
	   //int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
   return diffYear;
}


public static int no_of_months(Date sc,Date ec) {
	   Calendar startCalendar = new GregorianCalendar();
	   startCalendar.setTimeInMillis(sc.getTime());
	   Calendar endCalendar = new GregorianCalendar();
	   endCalendar.setTimeInMillis(ec.getTime());

	   int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
	   int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
   return diffMonth;
}



//============================================================================






public static int no_of_hours(Date sc,Date ec) {
	   
	   
		long diff = ec.getTime() - sc.getTime();
		 diff = diff / (60 * 60 * 1000) ;
	  return (int)diff;
}

//===========================================================================
public static int no_of_minutes(Date sc,Date ec) {
		long diff = ec.getTime() - sc.getTime();
	    diff = diff / (60 * 1000) ;
	 return (int)diff;
}
  //===========================================================================================



public static int no_of_seconds(Date sc,Date ec) {
	  long diff = ec.getTime() - sc.getTime();
	    diff = diff / 1000 ;
	 return (int)diff;
	  
}

	  

	
 

}
