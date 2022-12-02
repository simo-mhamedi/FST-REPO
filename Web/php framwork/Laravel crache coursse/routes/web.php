<?php

use App\Http\Controllers\PagesController;
use App\Http\Controllers\WelcomeController;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

// Route::get('/', "App\Http\Controllers\WelcomeController@welcome");
Route::get('/', [PagesController::class,'index']);
Route::get('/about', [PagesController::class,'about']);
Route::get('/services', [PagesController::class,'services']);
Route::get('/productDetails/{id}', [PagesController::class,'productDetails']);
Route::get('/create', [PagesController::class,'create']);
Route::post('/savedProducts', [PagesController::class,'saveProduct']);
