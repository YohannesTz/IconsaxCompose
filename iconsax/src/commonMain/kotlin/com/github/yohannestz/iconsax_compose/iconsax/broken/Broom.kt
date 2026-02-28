package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Broom: ImageVector
    get() {
        val current = _broom
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Broom",
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
                moveTo(x = 9.87f, y = 5.67f)
                lineTo(x = 6.45f, y = 7.75f)
                lineTo(x = 4.89f, y = 5.2f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.67f, dy1 = -2.75f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.75f, dy1 = 0.67f)
                close()
                moveTo(x = 9.2f, y = 20.44f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.54f, dy1 = 1.03f)
                lineToRelative(dx = 6.43f, dy = -3.91f)
                arcToRelative(a = 2.46f, b = 2.46f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.71f, dy1 = -3.62f)
                lineToRelative(dx = -2.77f, dy = -3.74f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.29f, dy1 = -1.04f)
                lineToRelative(dx = -3.16f, dy = 1.92f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.51f, dy1 = 5.18f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.76f, y = 5.1f)
                lineTo(x = 5.63f, y = 8.22f)
                lineToRelative(dx = 2.08f, dy = 3.41f)
                lineToRelative(dx = 5.13f, dy = -3.12f)
                close()
                moveToRelative(dx = 3.55f, dy = 11.7f)
                lineToRelative(dx = 1.65f, dy = 2.72f)
                moveToRelative(dx = -4.21f, dy = -1.15f)
                lineToRelative(dx = 1.65f, dy = 2.71f)
                moveToRelative(dx = 3.47f, dy = -5.83f)
                lineToRelative(dx = 1.65f, dy = 2.71f)
            }
        }.build().also { _broom = it }
    }

@Suppress("ObjectPropertyName")
private var _broom: ImageVector? = null
