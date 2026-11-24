# PitStop Android Frontend

UI prototype aplikasi manajemen bengkel berdasarkan `PitStop Workshop App UI Storyboard.png`.

## Progres minggu ini

**Status:** UI wireframe prototype selesai, backend dan CRUD belum dikerjakan.

| Area | Status |
|---|---|
| Splash | Selesai: logo, tagline, indicator |
| Login | Selesai: field, remember me, forgot password, Google, register link |
| Register | Selesai: back action, 4 field, tombol daftar, login link |
| Dashboard | Selesai: header logo, KPI, ringkasan, alert stok, servis terbaru |
| Sparepart | Selesai: search, filter stok, list card, FAB |
| Kategori | Selesai: search dan list kategori |
| Pelanggan | Selesai: search, list card, jumlah kendaraan, FAB |
| Kendaraan | Selesai: detail, pemilik, spesifikasi, riwayat, edit |
| Servis | Selesai: form, riwayat, filter status, search, export action |
| Profil | Selesai: account card, role, menu, logout |
| Supplier | Selesai prototype: reachable route, search, supplier cards, FAB |
| Lupa Password | Selesai prototype: email reset form |
| Form Pelanggan | Selesai prototype: tambah pelanggan |
| Detail Servis | Selesai prototype: status, pelanggan, sparepart |
| Pengguna & Role | Selesai prototype: Admin/Mekanik list |
| Notifikasi | Selesai prototype: notification list |
| UI states | Selesai prototype: loading, empty, error, delete, export success |
| Navigation | Selesai prototype: bottom tabs dan feature routes |
| Backend/API/CRUD/DB | Ditunda untuk tahap berikutnya |

## Struktur

- `app/src/main/java/com/example/pitstop/features/` — screen per fitur
- `app/src/main/java/com/example/pitstop/ui/components/` — logo dan komponen bersama
- `app/src/main/java/com/example/pitstop/ui/navigation/` — route UI
- `app/src/main/java/com/example/pitstop/ui/theme/` — warna dan tema
- `app/src/main/res/drawable/pitstop_logo.png` — logo transparan

## Verifikasi

```bash
./gradlew :app:assembleDebug --no-daemon
```

Hasil terakhir: `BUILD SUCCESSFUL`.

## Catatan batasan

- Data masih dummy/local.
- Callback tombol belum menyimpan data.
- Tidak ada API, database, autentikasi nyata, atau CRUD.
- Kemiripan visual perlu validasi screenshot emulator terhadap storyboard pada perangkat target.

## Commit UI terbaru

- `26affc5` connect wireframe add actions to feature routes
- `4362958` match splash screen branding to wireframe
- `9da7662` connect wireframe bottom navigation routes
- `c4981f3` register all wireframe feature routes
- `9c8cfe9` match empty error loading and export states to wireframe
- `b859753` add remaining SRS UI screens
