package testPkg;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Dwnld2 {

	public static void main(String[] args) throws InterruptedException, IOException {
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

		WebDriver driver = new ChromeDriver(cap);

		Stream<Path> files = Files.list(Paths.get("D:\\downloaded"));
		long baseCount = files.count();
		long nextCount = baseCount;

		List<String> urls = Arrays.asList(
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6837889574186814722",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6836177288749403393",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6834808793944116482",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6833992756289981697",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6833635854595001602",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6833256116982435074",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6833249233710124289",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6832839871372086529",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6830648835304393986",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6829272410475351298",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6828164281733893377",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6827494676526877953",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6826573871030799617",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6826569703281003777",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6826568467819285762",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6826566737492757762",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6826566332134280449",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6826183930585058562",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6826182721182649601",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6826178209529269506",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6825788142868614402",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6824683069027437825",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6824681650668981505",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6824679802394430721",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6824678884244524290",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6820239297216662785",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6820238426130992385",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6819869784927177985",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6819867971255815426",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6818077319807257858",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6817610037435976962",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6817606339582332161",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6817604316069678338",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6817134320386362625",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6817072007436422401",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6816891200528780546",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6816677081150229761",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6816647673425300737",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6816646671896759553",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6816642634753330433",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6815666012940225793",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6815661105097051393",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6815652385864617218",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6814908213918567682",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6814821688664968449",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6814792786471144706",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6814792423953140993",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6814421956654386433",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6814421455737048322",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6814269844628802818",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6814181529145593089",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6814148257640402178",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6812631183407467777",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6812627866216336642",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6812626405705256194",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6812550516774571265",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6811839278319029506",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6811803150236896513",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6810380593730178305",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6809700746414591233",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6809666907361283330",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6805754794905488642",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6805131999049747714",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6804842166410661121",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6804752478727425282",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6804744388829383938",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6804743922154278145",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6802976828400160002",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6801064689410313473",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6800924695135784193",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6794506498203602177",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6794043727833877762",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6794031607360654593",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6794029738756230402",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6793186758591794433",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6793014915209727234",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6792638434465828098",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6790206952585579778",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6790206428532591873",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6790205950407068929",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6786246988489886978",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6786243087610957058",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6785735932994653442",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6785123368552205569",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6785075948673895682",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6785075190050147586",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6784830191517650178",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6784682202543213825",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6784673794356251905",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6784454203143163137",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6784337146279972097",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6784335358877306114",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6783590655433248002",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6772581318409604353",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6772575527166348545",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6772575168993840385",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6768282238061710594",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6767601841367813378",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6767397070648216834",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6767022602885025025",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6766905313711918337",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6766898042399395073",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6766895095871556866",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6766854622708567297",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6762543359820090626",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6762542344559398145",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6762538927766162689",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6762217001302691073",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6762215442942594306",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6762196177044770049",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6759055548613790977",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6758809237582826754",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6756398518073593090",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6753430923615800577",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6753207949818072321",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6753206007444294913",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6753140738541784321",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6753140159954341121",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6753134424294018306",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6753125776830319874",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6752946318613712130",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6752928495040466178",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6752927184211545345",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6748680549679811842",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6748332318877961473",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6746884719025114369",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6744700784295890177",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6744698607368277250",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6744635486511418626",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6744324680133479682",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6744307260874296577",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6737506311300254978",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6735104238520667394",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6735091476511853825",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6734946414486506753",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6734320642969062657",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6734300785112337665",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6733842495228218626",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6733842031367523586",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6733548309039844609",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6733546290858282241",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732445335320284418",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732435231044848897",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732398089849572610",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732389345459768578",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732387745571917058",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732076888535190785",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732074331733544193",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732050282286419201",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732038735095008514",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732031752216284421",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6732027647762648326",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6729489560394353921",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6729343465328594178",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6729321649608363266",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6728979090931551489",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6728963550414425346",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6728748172316839169",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6728710247252315394",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6728706654805789953",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6728612407406611713",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6728594118907268353",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6728463942122851586",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6728208034784431362",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727980360107396354",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727944243869994242",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727943343407484161",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727898530658241793",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727685628357610754",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727513893003922689",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727285835206610178",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727249032881687810",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727093524895993090",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6727078016452775169",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726910077082668289",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726842409050705158",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726839678294625542",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726793842391043329",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726773228175412482",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726765093494721793",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726754033979182338",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726730836877577473",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726726588383218945",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726712278844017922",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726524137998650625",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726436080729525506",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726433516021746945",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726428692295224577",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726422698299346177",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726420821973241090",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726418682748128513",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6726184803370028293",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6725808557092130050",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6725723178452176130",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6725675843697396994",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6725615039920835841",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6725356031683087617",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6725125643031399681",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6725121692911291649",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6725119113062042882",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6725118173055618306",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6724354896210005250",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6724298425489231105",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6724272530762288386",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6720611583963319554",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6719364750507019522",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6719351543964962049",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6718741866445049090",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6718426277327424769",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6718416364882676993",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6718327481998331138",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6718326157067963649",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6718324159597874434",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6718321312936299778",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6718319069294038274",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6718318196757138690",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6717951707470433538",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6717947523601861889",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6717512357008002306",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6717509600964283649",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6716447759186054402",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6716424470384348421",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6716392876005133574",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6716333703779323142",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6716141391900052741",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6716118446658030854",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6716107749786127621",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6716106398733700358",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6714238716237319429",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6714181766682250501",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6713967010465713414",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6711876273385245957",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6711871413763984646",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6711211774739221766",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6711210601164573958",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6710987433279753478",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6710985432907123973",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6710983836047527174",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6710981514399583493",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6710978748906212614",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6710975573121830150",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6710627000945478918",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6710597659037535494",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6708648333570739461",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6708644950931672325",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6708643829097958661",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6708636229551787269",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707982449806150918",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707570280157416709",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707568244552633606",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707307759831878918",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707305309720808710",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707304430007487750",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707302040541859078",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707300862269607174",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707269685789854982",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707267839092329734",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6707257957576346886",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6706374915718647046",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6706373239670574342",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6706040387875638534",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6705375232196087046",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6705373701577116933",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6703781097504771334",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6702411292050722053",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701707503408778501",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701701546146532613",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701693329320447237",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701518262229798149",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701258752131075333",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701241358788594949",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701215691535568133",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701207344627322118",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701174338575404293",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701169849483136261",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701166660029517061",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6701164076510219525",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6700984367373618438",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6700103781096361222",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6700101743776107781",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6700099793131146501",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6696495264305253638",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6695579451616398597",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6692893613036145926",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6692714324172999941",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6692708989198667013",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6692703602768612613",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6692699070420487430",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6692694523010616582",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6690560764555562246",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6690542113068682501",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6690532408321641733",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6690480502211611910",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6690093432641162501",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6687091547600604422",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6687089765747002629",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6687089239877750022",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6687085543244696837",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6686870914740522246",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6686869104248229126",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6686676288565939462",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6686661233375972614",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6686488071883476229",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6686477141518847238",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6686362069681327365",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6685319373462179077",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6684501234067442950",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6684496884624526598",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6684495647711694085",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6684461878938176774",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6683143620486237445",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6683140151675194630",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6683116960634375430",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6683065658315377925",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6682661137852402949",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6682254326439611654",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6682246914659847429",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6681507663647345926",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6681505204749208837",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6681502992690056453",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6681447909398940934",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680902163427757317",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680754448878275846",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680750992415264006",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680747907529837829",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680173482304605445",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680168977127197957",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680159637481721093",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680158108544666885",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680081125123034373",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680079144727874821",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6680077352350780677",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6679430357634256133",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6679385301338557701",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6679271259085212933",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6679264678197071109",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6679087021027233030",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6679048678012882181",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6679046853352230150",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6678914184865910022",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6676660367965293830",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6674247090144546054",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6672374177594346757",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6672246372877470982",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6672178503565184261",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6671895431917604102",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6671892899614952709",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6671890852740074757",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6671879478173502726",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6668231917885738246",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6668221927284280581",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6667738171729513734",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6667724460268719365",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6667699638109211909",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6667489369651154182",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6667483137838157061",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6667421844590562566",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6667380048263122182",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6667373665891388677",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6667157778294902021",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666678455943302405",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666622634341436678",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666621415883541765",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666122342936087813",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666121222566186246",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666120311114566917",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666119578797477126",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666118139815660806",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666117740144626949",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6666024944444378374",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6664485274585664774",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6664466621760802053",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6664017992004685062",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6663806298775096581",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6663799754087992581",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6663786680157211909",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6663764982846459141",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6663285927940459782",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662624942602849542",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662619238747868422",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662617458903354629",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662594296954227973",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662593636754001158",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662373639691701510",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662343074766671109",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662285846927904006",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662281316467215622",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6662235228158823686",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660817953660865798",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660795973964401926",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660794337372146949",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660793542606064902",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660726860462165254",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660541945074420998",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660541028145040645",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660539439212662022",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660536328691649797",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660535689085455622",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660065784615668998",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660060091686849797",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660058437906337029",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6660057599863426310",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6659012264860847366",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6657817619309006085",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6657800182198963462",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6657459340493999366",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6657456290941373702",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6657119580374174981",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6656063513351425286",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6655318695696403718",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6655281954398670085",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6654547846831803654",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6653678993549561093",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6653271606695038214",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6652715342965509382",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6651263188698402053",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6651156376267525382",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6651093678251052294",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6650755759988542725",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6650124703518166278",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6650118068221512966",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6650112615118802182",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6648243486615145733",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6647171065908825349",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6647075341703580933",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6647068365028330757",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6647066682676219142",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6646590341199695109",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6646557176103963909",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6646317834676735238",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6646301802197159173",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6643642408133201157",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6640855865320541446",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6640749675114663173",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6640116120592321797",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6639881446389452038",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6639748456132906245",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6639627886976306437",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6639359221743750406",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6639180046667877638",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6638943389339356422",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6638941137379790086",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6638610497740475653",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6637337614275841286",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6637336112605957381",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6636979462997019909",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6633348766671834374",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6633341138642144517",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6632955944667974918",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6632952772280978694",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6632921004668620037",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6631430247717801221",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6630353988476734726",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6627421681801497861",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6627295557779983622",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6627292854194539782",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6627290091163225350",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6627061448675691782",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6627058237302639877",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6625114845349956869",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6623785337887919365",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6623777767848676613",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6621062706717789445",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6621058744669179142",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6609485587168627973",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6607674452928892165",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6606523595294248197",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6605786192719908102",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6602847890291297542",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6602029742432455941",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6600287385936727301",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6600016539246660870",
				"https://www.tiktok.com/@charlieyadhuvanshi/video/6598203753004797190");

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

				baseCount = nextCount;
				if (dwnbtn.isDisplayed()) {
					dwnbtn.click();
					Thread.sleep(15000);
//					FileClass.writeFile("D:\\downloaded-00sweety1.txt", url);
					try (Stream<Path> file = Files.list(Paths.get("D:\\downloaded"))) {
						nextCount = file.count();
						if (nextCount > baseCount) {
							FileClass.writeFile("D:\\downloaded-success.txt", url);

							String fileName = FileClass.getLastModified("D:\\downloaded").getName();
							String newName = url.split("@")[1].split("/")[0] + " - " + url.split("@")[1].split("/")[2];
							System.out.println("fileName : " + fileName);
							System.out.println("newName : " + newName);

							File f1 = new File("D:\\downloaded\\" + fileName);
							File f2 = new File("D:\\downloaded\\" + newName + ".mp4");
							f1.renameTo(f2);
						} else {
							FileClass.writeFile("D:\\downloadFailed.txt", url);
						}
						System.out.println("FileCount : " + nextCount);
					}
				} else
					FileClass.writeFile("D:\\downloadFailed.txt", url);
			} catch (NoSuchElementException exception) {
				// TODO: handle exception
			}

		}
	}

}