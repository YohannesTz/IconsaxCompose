package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dribbble: ImageVector
    get() {
        val current = _dribbble
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dribbble",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.5f, y = 4.79f)
                arcToRelative(a = 13.4f, b = 13.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -12.83f, dy1 = 6.69f)
                lineTo(x = 2.5f, y = 11.19f)
                moveToRelative(dx = 3.0f, dy = 8.18f)
                arcToRelative(a = 13.4f, b = 13.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 12.83f, dy1 = -6.69f)
                lineToRelative(dx = 3.17f, dy = 0.29f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.63f, y = 3.0f)
                lineToRelative(dx = 3.18f, dy = 3.95f)
                arcToRelative(a = 23.0f, b = 23.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.44f, dy1 = 9.0f)
                lineToRelative(dx = 1.21f, dy = 4.99f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _dribbble = it }
    }

@Suppress("ObjectPropertyName")
private var _dribbble: ImageVector? = null
