package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoteText: ImageVector
    get() {
        val current = _noteText
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NoteText",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.75f, y = 3.5f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.25f, y1 = 1.59f, x2 = 7.25f, y2 = 2.0f)
                verticalLineToRelative(dy = 1.56f)
                quadTo(x1 = 7.61f, y1 = 3.51f, x2 = 8.0f, y2 = 3.5f)
                close()
                moveToRelative(dx = 8.0f, dy = 0.06f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 15.25f, y1 = 1.59f, x2 = 15.25f, y2 = 2.0f)
                verticalLineToRelative(dy = 1.5f)
                horizontalLineTo(x = 16.0f)
                quadToRelative(dx1 = 0.39f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.06f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.75f, y = 3.56f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 15.25f, y1 = 5.41f, x2 = 15.25f, y2 = 5.0f)
                verticalLineTo(y = 3.5f)
                horizontalLineToRelative(dx = -6.5f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 7.25f, y1 = 5.41f, x2 = 7.25f, y2 = 5.0f)
                verticalLineTo(y = 3.56f)
                curveTo(x1 = 4.3f, y1 = 3.83f, x2 = 3.0f, y2 = 5.73f, x3 = 3.0f, y3 = 8.5f)
                verticalLineTo(y = 17.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 1.5f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.5f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineTo(y = 8.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.77f, dx2 = -1.3f, dy2 = -4.67f, dx3 = -4.25f, dy3 = -4.94f)
                moveTo(x = 12.0f, y = 16.75f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 15.25f, x2 = 8.0f, y2 = 15.25f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 4.0f, dy = -5.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 10.25f, x2 = 8.0f, y2 = 10.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _noteText = it }
    }

@Suppress("ObjectPropertyName")
private var _noteText: ImageVector? = null
