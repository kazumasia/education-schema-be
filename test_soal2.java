<!DOCTYPE html>
<html>
    <?php 
    $data = array(1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1);
    for ($i = 0; $i<count($data); $i++) {
        echo "(".$data[$i].")</br>";
        echo "<br>";
    }
	if(isset($_POST['data'])){
		$data = $_POST['data'];
		switch ($data) {
		    case '0':
			echo("index ke 0 adalah integer dengan angka 1");
			break;
			case '1':
			    echo("index ke 1 adalah string dengan data kawah");
			break;
			case '2':
				echo("index ke 2 adalah integer dengan angka 67");
			break;
			case '3':
			echo("index ke 3 adalah string dengan data wah");
			break;
			case '4':
			echo("index ke 4 adalah integer dengan angka 1772");
			break;
			case '5':
			    echo("index ke 5 adalah string dengan data edukasi ");
			break;
			case '6':
			    echo("index ke 6 adalah integer dengan angka 7");
			break;
			case '7':
			    echo("index ke 7 adalah integer dengan angka 98");
			break;
			case '8':
			    echo("index ke 8 adalah integer dengan angka -1");
			    break;
            default:
            echo("-INDEX TIDAK DIVALIDASI SISTEM");
		}
	}
	?>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>`substitute(Filename('', 'Page Title'), '^.', '\u&', '')`</title>
    </head>
<body>
        <div class="data">
		<h2 class="judul">menentukan tipe data</h2>
		<form method="post" action="ayam.php">			
			<input type="text" name="data" class="data" autocomplete="off" placeholder="Masukkan nomor index">
			</form>
	</div>
</body>
</html>