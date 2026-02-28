package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Firstline: ImageVector
    get() {
        val current = _firstline
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Firstline",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.0f, y = 5.25f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 13.59f, y1 = 3.75f, x2 = 14.0f, y2 = 3.75f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 21.41f, y1 = 5.25f, x2 = 21.0f, y2 = 5.25f)
                moveToRelative(dx = 0.0f, dy = 5.0f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 13.59f, y1 = 8.75f, x2 = 14.0f, y2 = 8.75f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 0.0f, dy = 5.0f)
                horizontalLineTo(x = 3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.59f, y1 = 13.75f, x2 = 3.0f, y2 = 13.75f)
                horizontalLineToRelative(dx = 18.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 0.0f, dy = 5.0f)
                horizontalLineTo(x = 3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.59f, y1 = 18.75f, x2 = 3.0f, y2 = 18.75f)
                horizontalLineToRelative(dx = 18.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -13.08f, dy = -9.5f)
                horizontalLineTo(x = 5.08f)
                quadToRelative(dx1 = -2.32f, dy1 = 0.0f, dx2 = -2.33f, dy2 = -2.33f)
                verticalLineTo(y = 5.58f)
                quadToRelative(dx1 = 0.0f, dy1 = -2.32f, dx2 = 2.33f, dy2 = -2.33f)
                horizontalLineToRelative(dx = 2.85f)
                quadToRelative(dx1 = 2.32f, dy1 = 0.0f, dx2 = 2.33f, dy2 = 2.33f)
                verticalLineToRelative(dy = 2.85f)
                quadToRelative(dx1 = -0.02f, dy1 = 2.31f, dx2 = -2.34f, dy2 = 2.32f)
                moveToRelative(dx = -2.84f, dy = -6.0f)
                curveToRelative(dx1 = -0.71f, dy1 = 0.0f, dx2 = -0.83f, dy2 = 0.12f, dx3 = -0.83f, dy3 = 0.83f)
                verticalLineToRelative(dy = 2.85f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.71f, dx2 = 0.12f, dy2 = 0.83f, dx3 = 0.83f, dy3 = 0.83f)
                horizontalLineToRelative(dx = 2.85f)
                curveToRelative(dx1 = 0.71f, dy1 = 0.0f, dx2 = 0.83f, dy2 = -0.12f, dx3 = 0.83f, dy3 = -0.83f)
                verticalLineTo(y = 5.58f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.71f, dx2 = -0.12f, dy2 = -0.83f, dx3 = -0.83f, dy3 = -0.83f)
                close()
            }
        }.build().also { _firstline = it }
    }

@Suppress("ObjectPropertyName")
private var _firstline: ImageVector? = null
