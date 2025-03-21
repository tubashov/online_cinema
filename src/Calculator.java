import java.util.List;

public class Calculator {

    private Calculator() {
    }

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double totalruntime = 0.0;

        for (MediaItem mediaItem : mediaItems) {
            double runtimeS;
            double runtimeM;
            double seriesCount;
            if (mediaItem instanceof Series) {
                seriesCount = ((Series) mediaItem).getSeriesCount();
                runtimeS = mediaItem.getRuntime();
                totalruntime = runtimeS * seriesCount / (60 * 24);
            }
            if (mediaItem instanceof Movie) {
                runtimeM = mediaItem.getRuntime();
                totalruntime = runtimeM / (60 * 24);
            }
        }
        return totalruntime;
    }
}