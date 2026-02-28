package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Card: ImageVector
    get() {
        val current = _card
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Card",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 7.55f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.2f, dy1 = 1.2f)
                horizontalLineTo(x = 3.2f)
                arcTo(horizontalEllipseRadius = 1.2f, verticalEllipseRadius = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 7.55f)
                verticalLineTo(y = 7.54f)
                arcTo(horizontalEllipseRadius = 4.14f, verticalEllipseRadius = 4.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.14f, y1 = 3.4f)
                horizontalLineToRelative(dx = 11.71f)
                arcTo(horizontalEllipseRadius = 4.15f, verticalEllipseRadius = 4.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 7.55f)
                moveToRelative(dx = -20.0f, dy = 3.9f)
                verticalLineToRelative(dy = 5.01f)
                arcToRelative(a = 4.14f, b = 4.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.14f, dy1 = 4.14f)
                horizontalLineToRelative(dx = 11.71f)
                arcTo(horizontalEllipseRadius = 4.15f, verticalEllipseRadius = 4.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 16.45f)
                verticalLineToRelative(dy = -5.0f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = -1.2f)
                horizontalLineTo(x = 3.2f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = 1.2f)
                moveToRelative(dx = 6.0f, dy = 5.8f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 15.75f, x2 = 6.0f, y2 = 15.75f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 8.41f, y1 = 17.25f, x2 = 8.0f, y2 = 17.25f)
                moveToRelative(dx = 6.5f, dy = 0.0f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _card = it }
    }

@Suppress("ObjectPropertyName")
private var _card: ImageVector? = null
