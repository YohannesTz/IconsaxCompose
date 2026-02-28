package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MusicSquareSearch: ImageVector
    get() {
        val current = _musicSquareSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MusicSquareSearch",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 8.65f)
                curveTo(x1 = 2.0f, y1 = 3.9f, x2 = 3.9f, y2 = 2.0f, x3 = 8.65f, y3 = 2.0f)
                horizontalLineToRelative(dx = 5.7f)
                curveTo(x1 = 19.1f, y1 = 2.0f, x2 = 21.0f, y2 = 3.9f, x3 = 21.0f, y3 = 8.65f)
                verticalLineToRelative(dy = 3.7f)
                moveTo(x = 12.35f, y = 21.0f)
                horizontalLineToRelative(dx = -3.7f)
                curveTo(x1 = 3.9f, y1 = 21.0f, x2 = 2.0f, y2 = 19.1f, x3 = 2.0f, y3 = 14.35f)
                verticalLineToRelative(dy = -1.38f)
                moveToRelative(dx = 4.72f, dy = 1.45f)
                arcToRelative(a = 1.45f, b = 1.45f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.9f)
                arcToRelative(a = 1.45f, b = 1.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.48f, y = 12.0f)
                verticalLineTo(y = 6.34f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.21f, dx2 = -0.76f, dy2 = -1.37f, dx3 = -1.52f, dy3 = -1.16f)
                lineTo(x = 9.07f, y = 5.97f)
                arcToRelative(a = 1.16f, b = 1.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.89f, dy1 = 1.16f)
                verticalLineToRelative(dy = 5.84f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.03f, y = 13.45f)
                arcToRelative(a = 1.45f, b = 1.45f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.9f)
                arcToRelative(a = 1.45f, b = 1.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.9f)
                moveTo(x = 8.17f, y = 8.83f)
                lineToRelative(dx = 5.3f, dy = -1.45f)
                moveToRelative(dx = 4.47f, dy = 13.9f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.4f)
                moveToRelative(dx = 3.8f, dy = 0.6f)
                lineToRelative(dx = -1.0f, dy = -1.0f)
            }
        }.build().also { _musicSquareSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _musicSquareSearch: ImageVector? = null
