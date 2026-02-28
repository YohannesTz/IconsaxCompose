package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sort: ImageVector
    get() {
        val current = _sort
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Sort",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.0f, y = 7.75f)
                horizontalLineTo(x = 3.0f)
                curveTo(x1 = 2.59f, y1 = 7.75f, x2 = 2.25f, y2 = 7.41f, x3 = 2.25f, y3 = 7.0f)
                reflectiveCurveTo(x1 = 2.59f, y1 = 6.25f, x2 = 3.0f, y2 = 6.25f)
                horizontalLineToRelative(dx = 18.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 21.41f, y1 = 7.75f, x2 = 21.0f, y2 = 7.75f)
                moveToRelative(dx = -3.0f, dy = 5.0f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 11.25f, x2 = 6.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 12.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -4.0f, dy = 5.0f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _sort = it }
    }

@Suppress("ObjectPropertyName")
private var _sort: ImageVector? = null
