package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaximizeOne: ImageVector
    get() {
        val current = _maximizeOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MaximizeOne",
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
                moveTo(x = 16.48f, y = 2.0f)
                horizontalLineTo(x = 8.52f)
                curveTo(x1 = 5.07f, y1 = 2.0f, x2 = 3.0f, y2 = 4.06f, x3 = 3.0f, y3 = 7.52f)
                verticalLineToRelative(dy = 7.95f)
                curveTo(x1 = 3.0f, y1 = 18.94f, x2 = 5.07f, y2 = 21.0f, x3 = 8.52f, y3 = 21.0f)
                horizontalLineToRelative(dx = 7.95f)
                curveToRelative(dx1 = 3.46f, dy1 = 0.0f, dx2 = 5.52f, dy2 = -2.06f, dx3 = 5.52f, dy3 = -5.52f)
                verticalLineTo(y = 7.52f)
                curveTo(x1 = 22.0f, y1 = 4.06f, x2 = 19.93f, y2 = 2.0f, x3 = 16.48f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.0f, y = 16.15f)
                verticalLineToRelative(dy = 2.7f)
                curveTo(x1 = 11.0f, y1 = 21.1f, x2 = 10.1f, y2 = 22.0f, x3 = 7.85f, y3 = 22.0f)
                horizontalLineToRelative(dx = -2.7f)
                curveTo(x1 = 2.9f, y1 = 22.0f, x2 = 2.0f, y2 = 21.1f, x3 = 2.0f, y3 = 18.85f)
                verticalLineToRelative(dy = -2.7f)
                curveTo(x1 = 2.0f, y1 = 13.9f, x2 = 2.9f, y2 = 13.0f, x3 = 5.15f, y3 = 13.0f)
                horizontalLineToRelative(dx = 2.7f)
                curveTo(x1 = 10.1f, y1 = 13.0f, x2 = 11.0f, y2 = 13.9f, x3 = 11.0f, y3 = 16.15f)
                moveToRelative(dx = 7.75f, dy = -10.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.05f, dy1 = -0.26f)
                lineToRelative(dx = -0.01f, dy = -0.02f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.13f, dy1 = -0.19f)
                lineTo(x = 18.5f, y = 5.43f)
                quadToRelative(dx1 = -0.08f, dy1 = -0.07f, dx2 = -0.15f, dy2 = -0.1f)
                lineTo(x = 18.28f, y = 5.3f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.26f, dy1 = -0.05f)
                horizontalLineTo(x = 14.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 13.58f, y1 = 6.72f, x2 = 14.0f, y2 = 6.72f)
                horizontalLineToRelative(dx = 2.21f)
                lineToRelative(dx = -3.74f, dy = 3.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineToRelative(dx = 3.73f, dy = -3.74f)
                verticalLineToRelative(dy = 2.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineTo(y = 5.97f)
                close()
            }
        }.build().also { _maximizeOne = it }
    }

@Suppress("ObjectPropertyName")
private var _maximizeOne: ImageVector? = null
