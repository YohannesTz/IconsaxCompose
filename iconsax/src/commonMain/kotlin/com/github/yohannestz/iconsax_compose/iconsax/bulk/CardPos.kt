package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardPos: ImageVector
    get() {
        val current = _cardPos
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardPos",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.25f, y = 22.0f)
                horizontalLineTo(x = 2.75f)
                curveTo(x1 = 2.34f, y1 = 22.0f, x2 = 2.0f, y2 = 21.66f, x3 = 2.0f, y3 = 21.25f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 18.5f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 21.66f, y1 = 22.0f, x2 = 21.25f, y2 = 22.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 20.59f, y = 13.7f)
                lineToRelative(dx = -7.23f, dy = 7.23f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.12f, dy1 = 0.0f)
                lineToRelative(dx = -4.61f, dy = -4.6f)
                lineTo(x = 15.99f, y = 3.97f)
                lineToRelative(dx = 4.6f, dy = 4.6f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 5.13f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.99f, y = 3.97f)
                lineTo(x = 3.62f, y = 16.33f)
                lineTo(x = 2.7f, y = 15.42f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.12f)
                lineToRelative(dx = 7.24f, dy = -7.23f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.12f, dy1 = -0.01f)
                close()
                moveToRelative(dx = -3.1f, dy = 13.63f)
                lineToRelative(dx = -1.35f, dy = 1.35f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.01f)
                lineToRelative(dx = 1.35f, dy = -1.35f)
                curveToRelative(dx1 = 0.28f, dy1 = -0.28f, dx2 = 0.73f, dy2 = -0.28f, dx3 = 1.01f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 0.28f, dy1 = 0.73f, dx2 = 0.0f, dy2 = 1.0f)
                moveToRelative(dx = 4.38f, dy = -4.38f)
                lineToRelative(dx = -2.69f, dy = 2.69f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.01f)
                lineToRelative(dx = 2.69f, dy = -2.69f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.01f, dy1 = 0.0f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.01f)
            }
        }.build().also { _cardPos = it }
    }

@Suppress("ObjectPropertyName")
private var _cardPos: ImageVector? = null
