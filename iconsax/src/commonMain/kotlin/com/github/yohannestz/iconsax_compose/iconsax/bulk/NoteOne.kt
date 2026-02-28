package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NoteOne: ImageVector
    get() {
        val current = _noteOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NoteOne",
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
                moveTo(x = 7.37f, y = 22.0f)
                horizontalLineToRelative(dx = 9.25f)
                arcToRelative(a = 4.87f, b = 4.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.87f, dy1 = -4.87f)
                verticalLineTo(y = 8.37f)
                arcToRelative(a = 4.87f, b = 4.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.87f, dy1 = -4.87f)
                horizontalLineTo(x = 7.37f)
                arcTo(horizontalEllipseRadius = 4.87f, verticalEllipseRadius = 4.87f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.5f, y1 = 8.37f)
                verticalLineToRelative(dy = 8.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.7f, dx2 = 2.18f, dy2 = 4.88f, dx3 = 4.87f, dy3 = 4.88f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.29f, y = 6.29f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.78f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.76f)
                moveToRelative(dx = 7.42f, dy = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 2.75f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 2.78f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.76f)
                moveToRelative(dx = -0.93f, dy = 7.42f)
                horizontalLineTo(x = 7.36f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineToRelative(dx = 7.42f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                moveTo(x = 12.0f, y = 17.42f)
                horizontalLineTo(x = 7.36f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.5f)
                horizontalLineTo(x = 12.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _noteOne = it }
    }

@Suppress("ObjectPropertyName")
private var _noteOne: ImageVector? = null
