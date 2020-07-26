package testPkg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Dwnld {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(":::::::::::: Starting :::::::::::::");
		
		String downloadFilepath = "D:\\downloaded";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.htmlUnit();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);

		List<String> urls = Arrays.asList(
//				"https://www.tiktok.com/@riya.shines/video/6835607818599517446",  
//				"https://www.tiktok.com/@riya.shines/video/6832283008444157189",  
//				"https://www.tiktok.com/@riya.shines/video/6831925400793369862",  
//				"https://www.tiktok.com/@riya.shines/video/6828492128973262086",  
//				"https://www.tiktok.com/@riya.shines/video/6826706763471998214",  
//				"https://www.tiktok.com/@riya.shines/video/6826358577762929926",  
//				"https://www.tiktok.com/@riya.shines/video/6826248353727220998",  
//				"https://www.tiktok.com/@riya.shines/video/6824863654643567878",  
//				"https://www.tiktok.com/@riya.shines/video/6824523894888598790",  
//				"https://www.tiktok.com/@riya.shines/video/6824015297209470213",  
//				"https://www.tiktok.com/@riya.shines/video/6820792169767390469",  
//				"https://www.tiktok.com/@riya.shines/video/6819675301912595718",  
//				"https://www.tiktok.com/@riya.shines/video/6818798455604006150",  
//				"https://www.tiktok.com/@riya.shines/video/6818561860481207558",  
//				"https://www.tiktok.com/@riya.shines/video/6818477101381864710",  
//				"https://www.tiktok.com/@riya.shines/video/6818147604371721477",  
//				"https://www.tiktok.com/@riya.shines/video/6818063434563734789",  
//				"https://www.tiktok.com/@riya.shines/video/6817451634591911173",  
//				"https://www.tiktok.com/@riya.shines/video/6817445231730986246",  
//				"https://www.tiktok.com/@riya.shines/video/6817067688829979910",  
//				"https://www.tiktok.com/@riya.shines/video/6816661538712145153",  
//				"https://www.tiktok.com/@riya.shines/video/6815197047134735618",  
//				"https://www.tiktok.com/@riya.shines/video/6815154799336557826",  
//				"https://www.tiktok.com/@riya.shines/video/6814475567786659074",  
//				"https://www.tiktok.com/@riya.shines/video/6812586246058118402",  
//				"https://www.tiktok.com/@riya.shines/video/6808889067988602114",  
//				"https://www.tiktok.com/@riya.shines/video/6805396191493262593",  
//				"https://www.tiktok.com/@riya.shines/video/6804836892413152514",  
//				"https://www.tiktok.com/@riya.shines/video/6803990097973808386",  
//				"https://www.tiktok.com/@riya.shines/video/6802980051076795649",  
//				"https://www.tiktok.com/@riya.shines/video/6802148389397007618",  
//				"https://www.tiktok.com/@riya.shines/video/6801459439799979265",  
//				"https://www.tiktok.com/@riya.shines/video/6801137580055235841",  
//				"https://www.tiktok.com/@riya.shines/video/6800765655785164033",  
//				"https://www.tiktok.com/@riya.shines/video/6799941834375220481",  
//				"https://www.tiktok.com/@riya.shines/video/6799629050814926082",  
//				"https://www.tiktok.com/@riya.shines/video/6799199651238055170",  
//				"https://www.tiktok.com/@riya.shines/video/6799126427485703426",  
//				"https://www.tiktok.com/@riya.shines/video/6798778450309106945",  
//				"https://www.tiktok.com/@riya.shines/video/6798550761132264706",  
//				"https://www.tiktok.com/@riya.shines/video/6798126606658456834",  
//				"https://www.tiktok.com/@riya.shines/video/6797996520269434114",  
//				"https://www.tiktok.com/@riya.shines/video/6797767931049561346",  
//				"https://www.tiktok.com/@riya.shines/video/6796988910825213185",  
//				"https://www.tiktok.com/@riya.shines/video/6796598256337030401",  
//				"https://www.tiktok.com/@riya.shines/video/6796546810140790018",  
//				"https://www.tiktok.com/@riya.shines/video/6796311843536211201",  
//				"https://www.tiktok.com/@riya.shines/video/6795908610296745218",  
//				"https://www.tiktok.com/@riya.shines/video/6795555880403340545",  
//				"https://www.tiktok.com/@riya.shines/video/6795135877824662785",  
//				"https://www.tiktok.com/@riya.shines/video/6795114756043853057",  
//				"https://www.tiktok.com/@riya.shines/video/6795058250107702530",  
//				"https://www.tiktok.com/@riya.shines/video/6794817021872835842",  
//				"https://www.tiktok.com/@riya.shines/video/6794403084408851713",  
//				"https://www.tiktok.com/@riya.shines/video/6793965447391005953",  
//				"https://www.tiktok.com/@riya.shines/video/6793938837220412673",  
//				"https://www.tiktok.com/@riya.shines/video/6793641077795474690",  
//				"https://www.tiktok.com/@riya.shines/video/6793639839741889794",  
//				"https://www.tiktok.com/@riya.shines/video/6793574806383021313",  
//				"https://www.tiktok.com/@riya.shines/video/6793554306428669185",  
//				"https://www.tiktok.com/@riya.shines/video/6792946444761419009",  
				"https://www.tiktok.com/@riya.shines/video/6792597354357869825",  
				"https://www.tiktok.com/@riya.shines/video/6791671992807410945",  
				"https://www.tiktok.com/@riya.shines/video/6789321395726798081",  
				"https://www.tiktok.com/@riya.shines/video/6784048750567378178",  
				"https://www.tiktok.com/@riya.shines/video/6783672610497531137",  
				"https://www.tiktok.com/@riya.shines/video/6783303943180012801",  
				"https://www.tiktok.com/@riya.shines/video/6782893140442500353",  
				"https://www.tiktok.com/@riya.shines/video/6782805508702194946",  
				"https://www.tiktok.com/@riya.shines/video/6782015053034966274",  
				"https://www.tiktok.com/@riya.shines/video/6779100219184385286",  
				"https://www.tiktok.com/@riya.shines/video/6779094988190944518",  
				"https://www.tiktok.com/@riya.shines/video/6779059392991022337",  
				"https://www.tiktok.com/@riya.shines/video/6778055469899566341",  
				"https://www.tiktok.com/@riya.shines/video/6778004434338221317",  
				"https://www.tiktok.com/@riya.shines/video/6777236092404927749",  
				"https://www.tiktok.com/@riya.shines/video/6775747176883555589",  
				"https://www.tiktok.com/@riya.shines/video/6774586718533209350",  
				"https://www.tiktok.com/@riya.shines/video/6774285998210796806",  
				"https://www.tiktok.com/@riya.shines/video/6773586725546528006",  
				"https://www.tiktok.com/@riya.shines/video/6773122317972196613",  
				"https://www.tiktok.com/@riya.shines/video/6772810908658945286",  
				"https://www.tiktok.com/@riya.shines/video/6771723155422661894",  
				"https://www.tiktok.com/@riya.shines/video/6771719264962465029",  
				"https://www.tiktok.com/@riya.shines/video/6769067249786572037",  
				"https://www.tiktok.com/@riya.shines/video/6768654564645195014",  
				"https://www.tiktok.com/@riya.shines/video/6767596878524632326",  
				"https://www.tiktok.com/@riya.shines/video/6766901700268739845",  
				"https://www.tiktok.com/@riya.shines/video/6766787267433368837",  
				"https://www.tiktok.com/@riya.shines/video/6766575081469627654",  
				"https://www.tiktok.com/@riya.shines/video/6766123586857094406",  
				"https://www.tiktok.com/@riya.shines/video/6764764312344055045",  
				"https://www.tiktok.com/@riya.shines/video/6763823948695227653",  
				"https://www.tiktok.com/@riya.shines/video/6763457387769744646",  
				"https://www.tiktok.com/@riya.shines/video/6763127031635938565",  
				"https://www.tiktok.com/@riya.shines/video/6763063408653896965",  
				"https://www.tiktok.com/@riya.shines/video/6761601157052861702",  
				"https://www.tiktok.com/@riya.shines/video/6761213716110347525",  
				"https://www.tiktok.com/@riya.shines/video/6761208724964035845",  
				"https://www.tiktok.com/@riya.shines/video/6760964493418761478",  
				"https://www.tiktok.com/@riya.shines/video/6760633808040496389",  
				"https://www.tiktok.com/@riya.shines/video/6760596593654746374",  
				"https://www.tiktok.com/@riya.shines/video/6760549642271804673",  
				"https://www.tiktok.com/@riya.shines/video/6760206303806688518",  
				"https://www.tiktok.com/@riya.shines/video/6758237962309225734",  
				"https://www.tiktok.com/@riya.shines/video/6757274891159948549",  
				"https://www.tiktok.com/@riya.shines/video/6756905249535036678",  
				"https://www.tiktok.com/@riya.shines/video/6756857463422700806",  
				"https://www.tiktok.com/@riya.shines/video/6756033525310328070",  
				"https://www.tiktok.com/@riya.shines/video/6756016242601102597",  
				"https://www.tiktok.com/@riya.shines/video/6755769286599511301",  
				"https://www.tiktok.com/@riya.shines/video/6755768006309088518",  
				"https://www.tiktok.com/@riya.shines/video/6755049417243462917",  
				"https://www.tiktok.com/@riya.shines/video/6755019963968408833",  
				"https://www.tiktok.com/@riya.shines/video/6754731306204122373",  
				"https://www.tiktok.com/@riya.shines/video/6754349806522600709",  
				"https://www.tiktok.com/@riya.shines/video/6753807933693365505",  
				"https://www.tiktok.com/@riya.shines/video/6753790848481201414",  
				"https://www.tiktok.com/@riya.shines/video/6753531373937528065",  
				"https://www.tiktok.com/@riya.shines/video/6753530376586611970",  
				"https://www.tiktok.com/@riya.shines/video/6753528856939859201",  
				"https://www.tiktok.com/@riya.shines/video/6753438175605148929",  
				"https://www.tiktok.com/@riya.shines/video/6753413589224262917",  
				"https://www.tiktok.com/@riya.shines/video/6753217114963758338",  
				"https://www.tiktok.com/@riya.shines/video/6753151379063180549",  
				"https://www.tiktok.com/@riya.shines/video/6753149337833917701",  
				"https://www.tiktok.com/@riya.shines/video/6752356422417272065",  
				"https://www.tiktok.com/@riya.shines/video/6750556507697335554",  
				"https://www.tiktok.com/@riya.shines/video/6750536109769477378",  
				"https://www.tiktok.com/@riya.shines/video/6750307344577613057",  
				"https://www.tiktok.com/@riya.shines/video/6749852349994519809",  
				"https://www.tiktok.com/@riya.shines/video/6749568743292062977",  
				"https://www.tiktok.com/@riya.shines/video/6748826980713532673",  
				"https://www.tiktok.com/@riya.shines/video/6748343610908970241",  
				"https://www.tiktok.com/@riya.shines/video/6747704523264920834",  
				"https://www.tiktok.com/@riya.shines/video/6746625850201902337",  
				"https://www.tiktok.com/@riya.shines/video/6746277422464847106",  
				"https://www.tiktok.com/@riya.shines/video/6744789776110554373",  
				"https://www.tiktok.com/@riya.shines/video/6743901537074023685",  
				"https://www.tiktok.com/@riya.shines/video/6743140248169057541",  
				"https://www.tiktok.com/@riya.shines/video/6742533431672016133",  
				"https://www.tiktok.com/@riya.shines/video/6742465300538723590",  
				"https://www.tiktok.com/@riya.shines/video/6742319242403663109",  
				"https://www.tiktok.com/@riya.shines/video/6742181676501208326",  
				"https://www.tiktok.com/@riya.shines/video/6742170864608922885",  
				"https://www.tiktok.com/@riya.shines/video/6738762092087725318",  
				"https://www.tiktok.com/@riya.shines/video/6736539018256846086",  
				"https://www.tiktok.com/@riya.shines/video/6736104355826502917",  
				"https://www.tiktok.com/@riya.shines/video/6735725631176199429",  
				"https://www.tiktok.com/@riya.shines/video/6734707514664832261",  
				"https://www.tiktok.com/@riya.shines/video/6734362884274490629",  
				"https://www.tiktok.com/@riya.shines/video/6733946096655076614",  
				"https://www.tiktok.com/@riya.shines/video/6732487172663807237",  
				"https://www.tiktok.com/@riya.shines/video/6732485294936952069",  
				"https://www.tiktok.com/@riya.shines/video/6731670485760888069",  
				"https://www.tiktok.com/@riya.shines/video/6731668925882387718",  
				"https://www.tiktok.com/@riya.shines/video/6730145556229868806",  
				"https://www.tiktok.com/@riya.shines/video/6729505604387360006",  
				"https://www.tiktok.com/@riya.shines/video/6729504290802650373",  
				"https://www.tiktok.com/@riya.shines/video/6729433859118648582",  
				"https://www.tiktok.com/@riya.shines/video/6728831900707769605",  
				"https://www.tiktok.com/@riya.shines/video/6728376981924105477",  
				"https://www.tiktok.com/@riya.shines/video/6727546143636606213",  
				"https://www.tiktok.com/@riya.shines/video/6727107139480980741",  
				"https://www.tiktok.com/@riya.shines/video/6726778321679518981",  
				"https://www.tiktok.com/@riya.shines/video/6726775268385574150",  
				"https://www.tiktok.com/@riya.shines/video/6726461275003522309",  
				"https://www.tiktok.com/@riya.shines/video/6726216622631079174",  
				"https://www.tiktok.com/@riya.shines/video/6725775242586967301",  
				"https://www.tiktok.com/@riya.shines/video/6725731927468281093",  
				"https://www.tiktok.com/@riya.shines/video/6725330576011709702",  
				"https://www.tiktok.com/@riya.shines/video/6725082237911584005",  
				"https://www.tiktok.com/@riya.shines/video/6724185458638638341",  
				"https://www.tiktok.com/@riya.shines/video/6723211928119840006",  
				"https://www.tiktok.com/@riya.shines/video/6723174953409056006",  
				"https://www.tiktok.com/@riya.shines/video/6722432343908322566",  
				"https://www.tiktok.com/@riya.shines/video/6722107834701516037",  
				"https://www.tiktok.com/@riya.shines/video/6722016281006017797",  
				"https://www.tiktok.com/@riya.shines/video/6721758024999963909",  
				"https://www.tiktok.com/@riya.shines/video/6720914906599673093",  
				"https://www.tiktok.com/@riya.shines/video/6720640427982130438",  
				"https://www.tiktok.com/@riya.shines/video/6720249372375911686",  
				"https://www.tiktok.com/@riya.shines/video/6719838889982348549",  
				"https://www.tiktok.com/@riya.shines/video/6719520993880116485",  
				"https://www.tiktok.com/@riya.shines/video/6719301126807637254",  
				"https://www.tiktok.com/@riya.shines/video/6717621028178251014",  
				"https://www.tiktok.com/@riya.shines/video/6717618134808939781",  
				"https://www.tiktok.com/@riya.shines/video/6716813498585861382",  
				"https://www.tiktok.com/@riya.shines/video/6715441761763806469",  
				"https://www.tiktok.com/@riya.shines/video/6715383421419457797",  
				"https://www.tiktok.com/@riya.shines/video/6712418064618622213",  
				"https://www.tiktok.com/@riya.shines/video/6712363243936959749",  
				"https://www.tiktok.com/@riya.shines/video/6710971920579300613",  
				"https://www.tiktok.com/@riya.shines/video/6709421209823481094",  
				"https://www.tiktok.com/@riya.shines/video/6709041357240929541",  
				"https://www.tiktok.com/@riya.shines/video/6708969374906060038",  
				"https://www.tiktok.com/@riya.shines/video/6707937647706262789",  
				"https://www.tiktok.com/@riya.shines/video/6706916568716020997",  
				"https://www.tiktok.com/@riya.shines/video/6706765027296152837",  
				"https://www.tiktok.com/@riya.shines/video/6706718306503494917",  
				"https://www.tiktok.com/@riya.shines/video/6705430790026562822",  
				"https://www.tiktok.com/@riya.shines/video/6704967559269059845",  
				"https://www.tiktok.com/@riya.shines/video/6704674112800820485",  
				"https://www.tiktok.com/@riya.shines/video/6703469936565587205",  
				"https://www.tiktok.com/@riya.shines/video/6703410499549138181",  
				"https://www.tiktok.com/@riya.shines/video/6703409686961458438",  
				"https://www.tiktok.com/@riya.shines/video/6703408843549838598",  
				"https://www.tiktok.com/@riya.shines/video/6702022206798433541",  
				"https://www.tiktok.com/@riya.shines/video/6701491765104348421",  
				"https://www.tiktok.com/@riya.shines/video/6700925761383042309",  
				"https://www.tiktok.com/@riya.shines/video/6700885525886143750",  
				"https://www.tiktok.com/@riya.shines/video/6695309441467682053",  
				"https://www.tiktok.com/@riya.shines/video/6694851117936807174",  
				"https://www.tiktok.com/@riya.shines/video/6694208083435982086",  
				"https://www.tiktok.com/@riya.shines/video/6693156363767385349",  
				"https://www.tiktok.com/@riya.shines/video/6692360017875569925",  
				"https://www.tiktok.com/@riya.shines/video/6691973285023862022",  
				"https://www.tiktok.com/@riya.shines/video/6691969164862557446",  
				"https://www.tiktok.com/@riya.shines/video/6676752261453974789",  
				"https://www.tiktok.com/@riya.shines/video/6676497108108840198",  
				"https://www.tiktok.com/@riya.shines/video/6672750378557148422",  
				"https://www.tiktok.com/@riya.shines/video/6672256965168598278",  
				"https://www.tiktok.com/@riya.shines/video/6672236359819726085",  
				"https://www.tiktok.com/@riya.shines/video/6672230403161459974",  
				"https://www.tiktok.com/@riya.shines/video/6671825204399836422",  
				"https://www.tiktok.com/@riya.shines/video/6671096552313867526",  
				"https://www.tiktok.com/@riya.shines/video/6663374451972771078",  
				"https://www.tiktok.com/@riya.shines/video/6662189710103809285",  
				"https://www.tiktok.com/@riya.shines/video/6651165762956299525",  
				"https://www.tiktok.com/@riya.shines/video/6651162254303563014",  
				"https://www.tiktok.com/@riya.shines/video/6650406494938336518",  
				"https://www.tiktok.com/@riya.shines/video/6650378354996284677",  
				"https://www.tiktok.com/@riya.shines/video/6650376185647729926",  
				"https://www.tiktok.com/@riya.shines/video/6650370471743196421",  
				"https://www.tiktok.com/@riya.shines/video/6646673468538490117",  
				"https://www.tiktok.com/@riya.shines/video/6646662663499681030");

		
		
		
		
		
		for (String url : urls) {
			driver.get("https://snaptik.app/in");
			WebElement box = driver.findElement(By.cssSelector("input#url"));
			WebElement btn = driver.findElement(By.cssSelector("button.btn-download"));
			System.out.println(url);
			box.sendKeys(url);
			btn.click();
			WebElement alert = driver.findElement(By.cssSelector(".alert.alert-warning"));
			for (int i = 0; i <= 4; i++) {
				if (alert.isDisplayed()) {
					driver.get("https://snaptik.app/in");
					box.sendKeys(url);
					btn.click();
				}
			}

			Thread.sleep(10000);
			try {
				WebElement dwnbtn = driver
						.findElement(By.cssSelector("#div_download #download-block>div>a:nth-child(1)>span"));
				if (dwnbtn.isDisplayed()) {
					dwnbtn.click();
					Thread.sleep(16000);
					FileClass.writeFile("D:\\downloaded-riya.shines.txt", url);
				} else
					FileClass.writeFile("D:\\downloadFailed.txt", url);
			} catch (NoSuchElementException exception) {
				// TODO: handle exception
			}

		}
	}

}
