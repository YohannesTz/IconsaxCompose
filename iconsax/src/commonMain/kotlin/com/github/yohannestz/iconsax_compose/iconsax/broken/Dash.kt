package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dash: ImageVector
    get() {
        val current = _dash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Dash",
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
                moveTo(x = 6.01f, y = 20.5f)
                horizontalLineTo(x = 3.94f)
                lineTo(x = 5.0f, y = 16.25f)
                horizontalLineToRelative(dx = 7.44f)
                curveToRelative(dx1 = 3.56f, dy1 = 0.0f, dx2 = 5.31f, dy2 = -2.25f, dx3 = 5.31f, dy3 = -5.31f)
                verticalLineToRelative(dy = -0.19f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.75f, dx2 = -0.75f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                horizontalLineTo(x = 6.06f)
                lineTo(x = 7.12f, y = 3.5f)
                horizontalLineTo(x = 16.0f)
                curveToRelative(dx1 = 4.0f, dy1 = 0.0f, dx2 = 6.0f, dy2 = 2.5f, dx3 = 6.0f, dy3 = 6.0f)
                verticalLineTo(y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = -3.0f, dy2 = 8.5f, dx3 = -8.5f, dy3 = 8.5f)
                horizontalLineToRelative(dx = -2.56f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.5f, y = 10.5f)
                horizontalLineTo(x = 4.31f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = 1.51f)
                lineTo(x = 2.0f, y = 13.5f)
                horizontalLineToRelative(dx = 7.19f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = -1.51f)
                close()
            }
        }.build().also { _dash = it }
    }

@Suppress("ObjectPropertyName")
private var _dash: ImageVector? = null
