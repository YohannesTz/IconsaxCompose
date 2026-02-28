package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Box: ImageVector
    get() {
        val current = _box
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Box",
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
                moveTo(x = 3.17f, y = 7.44f)
                lineToRelative(dx = 8.83f, dy = 5.1f)
                lineToRelative(dx = 8.77f, dy = -5.07f)
                moveTo(x = 12.0f, y = 21.6f)
                verticalLineToRelative(dy = -9.07f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.39f, y = 9.17f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.2f, dy1 = -3.73f)
                lineToRelative(dx = 5.34f, dy = -2.97f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.15f, dy1 = 0.0f)
                lineToRelative(dx = 5.34f, dy = 2.97f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.2f, dy1 = 3.73f)
                verticalLineToRelative(dy = 5.65f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.2f, dy1 = 3.73f)
                lineToRelative(dx = -5.34f, dy = 2.97f)
                arcToRelative(a = 4.8f, b = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.15f, dy1 = 0.0f)
                lineToRelative(dx = -5.34f, dy = -2.97f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.2f, dy1 = -3.73f)
                verticalLineTo(y = 14.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 13.24f)
                verticalLineTo(y = 9.58f)
                lineToRelative(dx = -6.07f, dy = -3.5f)
                lineToRelative(dx = -1.05f, dy = -0.6f)
                lineTo(x = 7.51f, y = 4.1f)
            }
        }.build().also { _box = it }
    }

@Suppress("ObjectPropertyName")
private var _box: ImageVector? = null
