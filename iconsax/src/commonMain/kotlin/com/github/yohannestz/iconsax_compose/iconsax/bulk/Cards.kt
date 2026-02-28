package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cards: ImageVector
    get() {
        val current = _cards
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Cards",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 19.0f, y = 10.28f)
                verticalLineToRelative(dy = 7.15f)
                curveTo(x1 = 18.97f, y1 = 20.28f, x2 = 18.19f, y2 = 21.0f, x3 = 15.22f, y3 = 21.0f)
                horizontalLineTo(x = 5.78f)
                curveTo(x1 = 2.76f, y1 = 21.0f, x2 = 2.0f, y2 = 20.25f, x3 = 2.0f, y3 = 17.27f)
                verticalLineToRelative(dy = -6.99f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.7f, dx2 = 0.63f, dy2 = -3.57f, dx3 = 3.0f, dy3 = -3.71f)
                lineToRelative(dx = 0.78f, dy = -0.02f)
                horizontalLineToRelative(dx = 9.44f)
                curveToRelative(dx1 = 3.02f, dy1 = 0.0f, dx2 = 3.78f, dy2 = 0.75f, dx3 = 3.78f, dy3 = 3.73f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 6.73f)
                verticalLineToRelative(dy = 6.99f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.7f, dx2 = -0.63f, dy2 = 3.57f, dx3 = -3.0f, dy3 = 3.71f)
                verticalLineToRelative(dy = -7.15f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.98f, dx2 = -0.76f, dy2 = -3.73f, dx3 = -3.78f, dy3 = -3.73f)
                horizontalLineTo(x = 5.78f)
                lineTo(x = 5.0f, y = 6.57f)
                curveTo(x1 = 5.03f, y1 = 3.72f, x2 = 5.81f, y2 = 3.0f, x3 = 8.78f, y3 = 3.0f)
                horizontalLineToRelative(dx = 9.44f)
                curveTo(x1 = 21.24f, y1 = 3.0f, x2 = 22.0f, y2 = 3.75f, x3 = 22.0f, y3 = 6.73f)
                moveTo(x = 6.96f, y = 18.56f)
                horizontalLineTo(x = 5.24f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 1.72f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveToRelative(dx = 5.59f, dy = 0.0f)
                horizontalLineTo(x = 9.11f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.44f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 11.86f)
                horizontalLineTo(x = 2.0f)
                verticalLineToRelative(dy = 1.5f)
                horizontalLineToRelative(dx = 17.0f)
                close()
            }
        }.build().also { _cards = it }
    }

@Suppress("ObjectPropertyName")
private var _cards: ImageVector? = null
