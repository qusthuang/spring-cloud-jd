@echo off



start "xbin-store-cloud-web-admin" java -jar -Xms256m -Xmx256m  xbin-store-cloud-web-admin/build/libs/xbin-store-cloud-web-admin-1.0.0.jar

start "xbin-store-cloud-web-cart" java -jar -Xms256m -Xmx256m  xbin-store-cloud-web-cart/build/libs/xbin-store-cloud-web-cart-1.0.0.jar

start "xbin-store-cloud-web-item" java -jar -Xms256m -Xmx256m  xbin-store-cloud-web-item/build/libs/xbin-store-cloud-web-item-1.0.0.jar

start "xbin-store-cloud-web-notify" java -jar -Xms256m -Xmx256m  xbin-store-cloud-web-notify/build/libs/xbin-store-cloud-web-notify-1.0.0.jar

start "xbin-store-cloud-web-order" java -jar -Xms256m -Xmx256m  xbin-store-cloud-web-order/build/libs/xbin-store-cloud-web-order-1.0.0.jar

start "xbin-store-cloud-web-portal" java -jar -Xms256m -Xmx256m  xbin-store-cloud-web-portal/build/libs/xbin-store-cloud-web-portal-1.0.0.jar

start "xbin-store-cloud-web-search" java -jar -Xms256m -Xmx256m  xbin-store-cloud-web-search/build/libs/xbin-store-cloud-web-search-1.0.0.jar

start "xbin-store-cloud-web-sso" java -jar -Xms256m -Xmx256m  xbin-store-cloud-web-sso/build/libs/xbin-store-cloud-web-sso-1.0.0.jar
pause

