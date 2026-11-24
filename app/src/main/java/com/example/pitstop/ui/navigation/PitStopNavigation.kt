package com.example.pitstop.ui.navigation
import androidx.compose.runtime.*
import com.example.pitstop.features.auth.*
import com.example.pitstop.features.dashboard.DashboardScreen
import com.example.pitstop.features.sparepart.SparepartScreen
import com.example.pitstop.features.sparepart.CategoryScreen
import com.example.pitstop.features.vehicle.VehicleDetailScreen
import com.example.pitstop.features.customer.CustomerScreen
import com.example.pitstop.features.service.ServiceScreen
import com.example.pitstop.features.service.ServiceForm
import com.example.pitstop.features.profile.ProfileScreen
import com.example.pitstop.features.supplier.SupplierScreen
import com.example.pitstop.ui.theme.PitStopTheme
private enum class Route{Splash,Login,Register,Dashboard,Sparepart,Service,Customer,Profile,Category,VehicleDetail,ServiceForm,Supplier}
private fun tabRoute(tab:String,current:Route)=when(tab){"Beranda"->Route.Dashboard;"Sparepart"->Route.Sparepart;"Servis"->Route.Service;"Pelanggan"->Route.Customer;"Profil"->Route.Profile;"Kategori"->Route.Category;"VehicleDetail"->Route.VehicleDetail;"ServiceForm"->Route.ServiceForm;"Supplier"->Route.Supplier;else->current}
@Composable fun PitStopNavigation(){var route by remember{mutableStateOf(Route.Splash)};PitStopTheme{when(route){Route.Splash->SplashScreen{route=Route.Login};Route.Login->LoginScreen({route=Route.Dashboard},{route=Route.Register});Route.Register->RegisterScreen({route=Route.Dashboard},{route=Route.Login});Route.Dashboard->DashboardScreen{route=tabRoute(it,route)};Route.Sparepart->SparepartScreen{route=tabRoute(it,route)};Route.Service->ServiceScreen{route=tabRoute(it,route)};Route.Customer->CustomerScreen{route=tabRoute(it,route)};Route.Profile->ProfileScreen{route=tabRoute(it,route)};Route.Category->CategoryScreen();Route.VehicleDetail->VehicleDetailScreen();Route.ServiceForm->ServiceForm();Route.Supplier->SupplierScreen{route=tabRoute(it,route)}}}}
