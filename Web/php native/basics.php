<?php
// $my_var=1;
// $my_float=3.14;
// $my_string="test string";
// echo $my_float ." ".$my_float." ".$my_string;

$test_list=array(0=>"test 0",
                  1=>"test 1"  
);

foreach($test_list as $key)
{
    echo $key . "<br>";
};

$test_dec=array("marry"=>"female",
                "mic\hel"=>"homme"
);
foreach($test_dec as $key => $value)
{
    echo $key ."  ".$value."<br>";
}
$test_dec1=array("marry1"=>array("female","test"),
                "michel1"=>array("homme","test")
);
// print_r($test_dec1);
// ksort($test_dec);
// asort($test_dec);
// print_r($test_dec);
// print_r($test_dec);
// function  writeMessage() {
//     return 1+2;
// };
// echo writeMessage();



?>
<?php if (file_exists('test.txt')) { echo 'file found!'; } else { echo 'my_settings.txt 
    does not exist'; } ?>
<?php $fh = fopen("my_settings.txt", 'w') or die("Failed to create file"); ?> 
<?php fclose($fh); ?>
<?php $fh = fopen("my_settings.txt", 'w') or die("Failed to create file"); 
$text = " Hello Irisi 1";
fwrite($fh, $text) or die("Could not write to file"); 
fclose($fh); 
echo "File 'my_settings.txt' written successfully"; ?> 

<?php $fh = fopen("my_settings.txt", 'r') or die("File does not exist or you lack 
permission to open it");
$line = fgets($fh); 
echo $line; fclose($fh); ?>
<?php copy('my_settings.txt', 'my_settings_backup.txt') or die("Could not copy file"); 
echo "File successfully copied to 'my_settings_backup.txt'"; ?>

<?php
function my_error_handler($error_no, $error_msg)
{ echo "Opps, something went wrong:";
echo "Error number: [$error_no]";
echo "Error Description: [$error_msg]";
}
set_error_handler("my_error_handler");
echo $test;

try{
    $test="test";
    throw new Exception($test);
}
catch(Exception $e)
{
    echo $e->__toString();
}
?>
