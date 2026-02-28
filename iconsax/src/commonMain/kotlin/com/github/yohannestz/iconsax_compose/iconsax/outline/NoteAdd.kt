package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoteAdd: ImageVector
    get() {
        val current = _noteAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NoteAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.56f, y = 18.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.81f, y1 = 18.0f)
                verticalLineToRelative(dy = -5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 16.25f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 14.75f, x2 = 7.0f, y2 = 14.75f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveTo(x = 8.0f, y = 5.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.25f, y1 = 5.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.75f, y1 = 1.59f, x2 = 8.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.0f, y1 = 5.75f)
                moveToRelative(dx = 8.0f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.25f, y1 = 5.0f)
                verticalLineTo(y = 2.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 16.75f, y1 = 1.59f, x2 = 16.75f, y2 = 2.0f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 5.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.85f, y = 22.81f)
                curveToRelative(dx1 = -2.47f, dy1 = 0.0f, dx2 = -4.1f, dy2 = -0.54f, dx3 = -5.12f, dy3 = -1.7f)
                curveToRelative(dx1 = -1.18f, dy1 = -1.33f, dx2 = -1.37f, dy2 = -3.32f, dx3 = -1.41f, dy3 = -5.09f)
                lineTo(x = 2.19f, y = 9.85f)
                curveToRelative(dx1 = -0.1f, dy1 = -4.73f, dx2 = 1.47f, dy2 = -6.7f, dx3 = 5.57f, dy3 = -7.01f)
                lineToRelative(dx = 8.04f, dy = -0.16f)
                horizontalLineToRelative(dx = 0.04f)
                curveToRelative(dx1 = 4.11f, dy1 = 0.14f, dx2 = 5.75f, dy2 = 2.04f, dx3 = 5.85f, dy3 = 6.78f)
                lineToRelative(dx = 0.12f, dy = 6.17f)
                curveToRelative(dx1 = 0.04f, dy1 = 1.77f, dx2 = -0.08f, dy2 = 3.77f, dx3 = -1.2f, dy3 = 5.14f)
                curveToRelative(dx1 = -1.02f, dy1 = 1.25f, dx2 = -2.74f, dy2 = 1.86f, dx3 = -5.41f, dy3 = 1.92f)
                lineToRelative(dx = -6.0f, dy = 0.12f)
                close()
                moveTo(x = 15.8f, y = 4.17f)
                lineTo(x = 7.83f, y = 4.33f)
                curveTo(x1 = 5.03f, y1 = 4.55f, x2 = 3.6f, y2 = 5.45f, x3 = 3.69f, y3 = 9.82f)
                lineToRelative(dx = 0.13f, dy = 6.17f)
                curveToRelative(dx1 = 0.04f, dy1 = 2.12f, dx2 = 0.35f, dy2 = 3.36f, dx3 = 1.03f, dy3 = 4.13f)
                curveToRelative(dx1 = 0.76f, dy1 = 0.86f, dx2 = 2.13f, dy2 = 1.24f, dx3 = 4.33f, dy3 = 1.19f)
                lineToRelative(dx = 6.0f, dy = -0.12f)
                curveToRelative(dx1 = 2.19f, dy1 = -0.04f, dx2 = 3.55f, dy2 = -0.48f, dx3 = 4.28f, dy3 = -1.37f)
                curveToRelative(dx1 = 0.65f, dy1 = -0.79f, dx2 = 0.91f, dy2 = -2.04f, dx3 = 0.86f, dy3 = -4.16f)
                lineTo(x = 20.2f, y = 9.49f)
                curveToRelative(dx1 = -0.1f, dy1 = -4.36f, dx2 = -1.56f, dy2 = -5.22f, dx3 = -4.4f, dy3 = -5.32f)
            }
        }.build().also { _noteAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _noteAdd: ImageVector? = null
