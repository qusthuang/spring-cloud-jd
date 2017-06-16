@echo off

start "eureka" java -jar -Xms256m -Xmx256m xbin-store-cloud-eureka/build/libs/xbin-store-cloud-eureka-1.0.0.jar

start "xbin-store-cloud-config" java -jar -Xms256m -Xmx256m xbin-store-cloud-config/build/libs/xbin-store-cloud-config-1.0.0.jar

start "xbin-store-cloud-admin" java -jar -Xms256m -Xmx256m  xbin-store-cloud-admin/build/libs/xbin-store-cloud-admin-1.0.0.jar

start "xbin-store-cloud-sleuth" java -jar -Xms256m -Xmx256m  xbin-store-cloud-sleuth/build/libs/xbin-store-cloud-sleuth-1.0.0.jar

start "xbin-store-cloud-turbine" java -jar -Xms256m -Xmx256m  xbin-store-cloud-turbine/build/libs/xbin-store-cloud-turbine-1.0.0.jar

start "xbin-store-cloud-service-admin" java -jar -Xms256m -Xmx256m  xbin-store-cloud-service-admin/build/libs/xbin-store-cloud-service-admin-1.0.0.jar

start "xbin-store-cloud-service-cart" java -jar -Xms256m -Xmx256m  xbin-store-cloud-service-cart/build/libs/xbin-store-cloud-service-cart-1.0.0.jar

start "xbin-store-cloud-service-item" java -jar -Xms256m -Xmx256m  xbin-store-cloud-service-item/build/libs/xbin-store-cloud-service-item-1.0.0.jar

start "xbin-store-cloud-service-notify" java -jar -Xms256m -Xmx256m  xbin-store-cloud-service-notify/build/libs/xbin-store-cloud-service-notify-1.0.0.jar

start "xbin-store-cloud-service-order" java -jar -Xms256m -Xmx256m  xbin-store-cloud-service-order/build/libs/xbin-store-cloud-service-order-1.0.0.jar

start "xbin-store-cloud-service-portal" java -jar -Xms256m -Xmx256m  xbin-store-cloud-service-portal/build/libs/xbin-store-cloud-service-portal-1.0.0.jar

start "xbin-store-cloud-service-search" java -jar -Xms256m -Xmx256m  xbin-store-cloud-service-search/build/libs/xbin-store-cloud-service-search-1.0.0.jar

start "xbin-store-cloud-service-sso" java -jar -Xms256m -Xmx256m  xbin-store-cloud-service-sso/build/libs/xbin-store-cloud-service-sso-1.0.0.jar


pause

