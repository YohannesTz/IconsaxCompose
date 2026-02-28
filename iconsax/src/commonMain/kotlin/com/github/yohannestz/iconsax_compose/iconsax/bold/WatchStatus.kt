package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WatchStatus: ImageVector
    get() {
        val current = _watchStatus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WatchStatus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 3.75f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 7.59f, y1 = 3.75f, x2 = 7.25f, y2 = 3.41f, x3 = 7.25f, y3 = 3.0f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 2.25f, x2 = 8.0f, y2 = 2.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 16.41f, y1 = 3.75f, x2 = 16.0f, y2 = 3.75f)
                moveToRelative(dx = 0.0f, dy = 18.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 20.25f, x2 = 8.0f, y2 = 20.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveTo(x = 15.5f, y = 5.0f)
                horizontalLineToRelative(dx = -7.0f)
                quadTo(x1 = 5.0f, y1 = 5.0f, x2 = 5.0f, y2 = 8.5f)
                verticalLineToRelative(dy = 7.0f)
                quadTo(x1 = 5.0f, y1 = 19.0f, x2 = 8.5f, y2 = 19.0f)
                horizontalLineToRelative(dx = 7.0f)
                quadToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -3.5f)
                verticalLineToRelative(dy = -7.0f)
                quadTo(x1 = 19.0f, y1 = 5.0f, x2 = 15.5f, y2 = 5.0f)
                moveToRelative(dx = -5.75f, dy = 9.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.75f, y1 = 12.59f, x2 = 9.75f, y2 = 13.0f)
                close()
                moveToRelative(dx = 3.0f, dy = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                close()
                moveToRelative(dx = 3.0f, dy = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                close()
            }
        }.build().also { _watchStatus = it }
    }

@Suppress("ObjectPropertyName")
private var _watchStatus: ImageVector? = null
