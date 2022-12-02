<?php

namespace App\Http\Controllers;

use App\Models\Product;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class PagesController extends Controller
{
    public function index()
    {
        return view("pages.home");
    }
    public function about()
    {
        return view("pages.about");
    }
    public function services()
    {
        // $Products = Product::get();
        $Products = Product::orderBY("product_name","asc")->simplePaginate(1);

        return view("pages.services")->with('products',$Products);
    }
    public function productDetails($id)
    {
        // $Products = Product::get();
        $product = DB::table("products")
        ->where("id","=",$id)
        ->first();
        return view("pages.productDetails")->with('product',$product);
    }


    public function create()
    {
        return view("pages.create");
    }

    public function saveProduct(Request $r)
    {
        $Product = new Product();
        $Product->product_name = $r->product_name;
        $Product->product_price = $r->product_price;
        $Product->product_description = $r->product_description;
        $Product->save();
        return view("pages.create");
    }
}
