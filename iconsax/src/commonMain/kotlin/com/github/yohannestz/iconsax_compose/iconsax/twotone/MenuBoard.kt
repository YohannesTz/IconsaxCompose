package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MenuBoard: ImageVector
    get() {
        val current = _menuBoard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MenuBoard",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.93f, y = 6.76f)
                lineTo(x = 18.56f, y = 20.3f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.38f, y1 = 22.0f)
                horizontalLineTo(x = 3.24f)
                arcToRelative(a = 2.26f, b = 2.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.14f, dy1 = -2.93f)
                lineTo(x = 5.31f, y = 5.55f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.14f, dy1 = -1.59f)
                horizontalLineToRelative(dx = 12.3f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.07f, dy1 = 1.38f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.11f, dy1 = 1.42f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.0f, y = 22.0f)
                horizontalLineToRelative(dx = 4.78f)
                curveToRelative(dx1 = 1.29f, dy1 = 0.0f, dx2 = 2.3f, dy2 = -1.09f, dx3 = 2.21f, dy3 = -2.38f)
                lineTo(x = 22.0f, y = 6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.68f, y = 6.38f)
                lineToRelative(dx = 1.04f, dy = -4.32f)
                moveToRelative(dx = 5.66f, dy = 4.33f)
                lineToRelative(dx = 0.94f, dy = -4.34f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.7f, y = 12.0f)
                horizontalLineToRelative(dx = 8.0f)
                moveToRelative(dx = -9.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _menuBoard = it }
    }

@Suppress("ObjectPropertyName")
private var _menuBoard: ImageVector? = null
