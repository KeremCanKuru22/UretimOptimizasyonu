# Üretim Optimizasyonu - Java

Bu proje, bir üretim hattında farklı işlerin farklı makinelerde işlenme sürelerini ve makineler arası geçiş maliyetlerini dikkate alarak **minimum toplam süreyi** hesaplayan bir Java programıdır.

## Amaç

Belirli işlerin farklı makinelerde işlenmesi gerekir. Her iş için her makinede farklı işlenme süreleri olabilir. Ayrıca bir işten diğerine geçerken farklı makineler arasında geçiş maliyetleri oluşur. Bu program, tüm işleri en az sürede tamamlayacak ideal makine sıralamasını bulmayı amaçlar.

## Girdi

1. `sureMat` (2D dizi): İşlerin makinelerdeki işlenme süreleri.
2. `gecisMaliyet` (2D dizi): Makineler arası geçiş maliyetleri.

### Örnek Girdi

```java
int[][] sureMat = {
    {8, 2, 10},
    {6, 7, 3},
    {1, 5, 6},
    {7, 4, 9}
};

int[][] gecisMaliyet = {
    {0, 4, 5},
    {2, 3, 1},
    {5, 1, 0}
};
