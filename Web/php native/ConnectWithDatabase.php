
<?php
require "config.php";
try{
$pdo ->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
$pdo->exec('SET NAMES "utf8"');
$sql_stmt = "SELECT * FROM `cli ent`";
$result = $pdo->query($sql_stmt);
// set the resulting array to associative 
$result->setFetchMode(PDO::FETCH_ASSOC);
$data = array();
foreach ($result as $row) {
$data[] = $row;
}
print_r($data);
}
catch (PDOException $e) {
echo $e->getMessage();
}

<?php
session_start(); //start the PHP_session function
if(isset($_SESSION['page_count'])) {
$_SESSION['page_count'] += 1; 
} 
else { 
$_SESSION['page_count'] = 1;
} 
echo 'You are visitor number ' . $_SESSION['page_count']; 
?>