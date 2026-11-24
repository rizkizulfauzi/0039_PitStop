package com.example.pitstop.ui.navigation
import androidx.compose.runtime.*
import com.example.pitstop.features.auth.*
import com.example.pitstop.features.customer.CustomerFormScreen
import com.example.pitstop.features.service.ServiceDetailScreen
import com.example.pitstop.features.profile.RoleManagementScreen
import com.example.pitstop.features.dashboard.NotificationScreen
import com.example.pitstop.features.dashboard.DashboardScreen
import com.example.pitstop.features.sparepart.SparepartScreen
import com.example.pitstop.features.sparepart.CategoryScreen
import com.example.pitstop.features.vehicle.VehicleDetailScreen
import com.example.pitstop.features.customer.CustomerScreen
import com.example.pitstop.features.service.ServiceScreen
import com.example.pitstop.features.service.ServiceForm
import com.example.pitstop.features.profile.ProfileScreen
import com.example.pitstop.features.supplier.SupplierScreen
import com.example.pitstop.features.supplier.SupplierFormScreen
import com.example.pitstop.features.sparepart.SparepartEditScreen
import com.example.pitstop.features.sparepart.CategoryFormScreen
import com.example.pitstop.features.vehicle.VehicleFormScreen
import com.example.pitstop.features.profile.EditProfileScreen
import com.example.pitstop.features.common.*
import com.example.pitstop.ui.theme.PitStopTheme
private enum class Route{Splash,Login,Register,Dashboard,Sparepart,Service,Customer,Profile,Category,VehicleDetail,ServiceForm,Supplier,ForgotPassword,CustomerForm,ServiceDetail,RoleManagement,Notifications,SparepartEdit,CategoryForm,SupplierForm,VehicleForm,EditProfile,StockMovement,JobAttributes,Report}
private fun tabRoute(tab:String,current:Route)=when(tab){"Beranda"->Route.Dashboard;"Sparepart"->Route.Sparepart;"Servis"->Route.Service;"Pelanggan"->Route.Customer;"Profil"->Route.Profile;"Kategori"->Route.Category;"VehicleDetail"->Route.VehicleDetail;"ServiceForm"->Route.ServiceForm;"Supplier"->Route.Supplier;"ForgotPassword"->Route.ForgotPassword;"CustomerForm"->Route.CustomerForm;"ServiceDetail"->Route.ServiceDetail;"RoleManagement"->Route.RoleManagement;"Notifications"->Route.Notifications;"SparepartEdit"->Route.SparepartEdit;"CategoryForm"->Route.CategoryForm;"SupplierForm"->Route.SupplierForm;"VehicleForm"->Route.VehicleForm;"EditProfile"->Route.EditProfile;"StockMovement"->Route.StockMovement;"JobAttributes"->Route.JobAttributes;"Report"->Route.Report;else->current}
@Composable fun PitStopNavigation(){var route by remember{mutableStateOf(Route.Splash)};PitStopTheme{when(route){Route.Splash->SplashScreen{route=Route.Login};Route.Login->LoginScreen({route=Route.Dashboard},{route=Route.Register});Route.Register->RegisterScreen({route=Route.Dashboard},{route=Route.Login});Route.Dashboard->DashboardScreen{route=tabRoute(it,route)};Route.Sparepart->SparepartScreen{route=tabRoute(it,route)};Route.Service->ServiceScreen{route=tabRoute(it,route)};Route.Customer->CustomerScreen{route=tabRoute(it,route)};Route.Profile->ProfileScreen{route=tabRoute(it,route)};Route.Category->CategoryScreen();Route.VehicleDetail->VehicleDetailScreen();Route.ServiceForm->ServiceForm();Route.Supplier->SupplierScreen{route=tabRoute(it,route)};Route.ForgotPassword->ForgotPasswordScreen{route=Route.Login};Route.CustomerForm->CustomerFormScreen();Route.ServiceDetail->ServiceDetailScreen();Route.RoleManagement->RoleManagementScreen();Route.Notifications->NotificationScreen();Route.SparepartEdit->SparepartEditScreen();Route.CategoryForm->CategoryFormScreen();Route.SupplierForm->SupplierFormScreen();Route.VehicleForm->VehicleFormScreen();Route.EditProfile->EditProfileScreen();Route.StockMovement->StockMovementScreen();Route.JobAttributes->JobAttributesScreen();Route.Report->ReportScreen()}}}
