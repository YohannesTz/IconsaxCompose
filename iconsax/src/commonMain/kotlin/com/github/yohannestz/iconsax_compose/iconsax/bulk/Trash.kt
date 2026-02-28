package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Trash: ImageVector
    get() {
        val current = _trash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Trash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.07f, y = 5.23f)
                arcToRelative(a = 111.0f, b = 111.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.84f, dy1 = -0.37f)
                verticalLineTo(y = 4.85f)
                lineToRelative(dx = -0.22f, dy = -1.3f)
                curveToRelative(dx1 = -0.15f, dy1 = -0.92f, dx2 = -0.37f, dy2 = -2.3f, dx3 = -2.71f, dy3 = -2.3f)
                horizontalLineToRelative(dx = -2.62f)
                curveToRelative(dx1 = -2.33f, dy1 = 0.0f, dx2 = -2.55f, dy2 = 1.32f, dx3 = -2.71f, dy3 = 2.29f)
                lineTo(x = 7.76f, y = 4.82f)
                quadTo(x1 = 6.36f, y1 = 4.9f, x2 = 4.97f, y2 = 5.03f)
                lineToRelative(dx = -2.04f, dy = 0.2f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.68f, dy1 = 0.82f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.82f, dy1 = 0.67f)
                lineToRelative(dx = 2.04f, dy = -0.2f)
                arcToRelative(a = 80.0f, b = 80.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 15.82f, dy1 = 0.21f)
                horizontalLineToRelative(dx = 0.08f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.75f, dy1 = -0.68f)
                arcToRelative(a = 0.77f, b = 0.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.69f, dy1 = -0.82f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.399f,
                strokeAlpha = 0.399f,
            ) {
                moveTo(x = 19.23f, y = 8.14f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.91f, dy1 = -0.39f)
                horizontalLineTo(x = 5.68f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.25f, dy1 = 1.33f)
                lineToRelative(dx = 0.62f, dy = 10.26f)
                curveToRelative(dx1 = 0.11f, dy1 = 1.52f, dx2 = 0.25f, dy2 = 3.42f, dx3 = 3.74f, dy3 = 3.42f)
                horizontalLineToRelative(dx = 6.42f)
                curveToRelative(dx1 = 3.49f, dy1 = 0.0f, dx2 = 3.63f, dy2 = -1.89f, dx3 = 3.74f, dy3 = -3.42f)
                lineToRelative(dx = 0.62f, dy = -10.25f)
                arcToRelative(a = 1.3f, b = 1.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.34f, dy1 = -0.95f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(x = 9.58f, y = 17.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.75f)
                horizontalLineToRelative(dx = 3.33f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                horizontalLineToRelative(dx = -3.33f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.58f, y1 = 17.0f)
                moveToRelative(dx = -0.83f, dy = -4.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.75f)
                horizontalLineToRelative(dx = 5.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
                horizontalLineToRelative(dx = -5.0f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.75f, y1 = 13.0f)
            }
        }.build().also { _trash = it }
    }

@Suppress("ObjectPropertyName")
private var _trash: ImageVector? = null
