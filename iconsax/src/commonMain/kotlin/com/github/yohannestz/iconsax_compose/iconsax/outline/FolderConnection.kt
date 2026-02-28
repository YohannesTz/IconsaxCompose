package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderConnection: ImageVector
    get() {
        val current = _folderConnection
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderConnection",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 19.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 19.0f)
                verticalLineToRelative(dy = -3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 3.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 19.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 23.75f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.5f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 5.5f)
                moveToRelative(dx = 0.0f, dy = -4.0f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.5f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.0f, y = 21.75f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -8.0f, dy = 0.0f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 20.25f, x2 = 6.0f, y2 = 20.25f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 5.5f, dy = -5.0f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -3.22f, dy1 = 0.0f, dx2 = -4.25f, dy2 = -1.03f, dx3 = -4.25f, dy3 = -4.25f)
                verticalLineToRelative(dy = -7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.22f, dx2 = 1.03f, dy2 = -4.25f, dx3 = 4.25f, dy3 = -4.25f)
                horizontalLineToRelative(dx = 1.05f)
                curveToRelative(dx1 = 1.33f, dy1 = 0.0f, dx2 = 1.76f, dy2 = 0.45f, dx3 = 2.28f, dy3 = 1.14f)
                lineToRelative(dx = 1.05f, dy = 1.4f)
                curveToRelative(dx1 = 0.2f, dy1 = 0.26f, dx2 = 0.2f, dy2 = 0.26f, dx3 = 0.52f, dy3 = 0.26f)
                horizontalLineToRelative(dx = 2.1f)
                curveToRelative(dx1 = 3.22f, dy1 = 0.0f, dx2 = 4.25f, dy2 = 1.03f, dx3 = 4.25f, dy3 = 4.25f)
                verticalLineToRelative(dy = 4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.22f, dx2 = -1.03f, dy2 = 4.25f, dx3 = -4.25f, dy3 = 4.25f)
                moveToRelative(dx = -7.0f, dy = -14.0f)
                curveToRelative(dx1 = -2.39f, dy1 = 0.0f, dx2 = -2.75f, dy2 = 0.36f, dx3 = -2.75f, dy3 = 2.75f)
                verticalLineToRelative(dy = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.39f, dx2 = 0.36f, dy2 = 2.75f, dx3 = 2.75f, dy3 = 2.75f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 2.39f, dy1 = 0.0f, dx2 = 2.75f, dy2 = -0.36f, dx3 = 2.75f, dy3 = -2.75f)
                verticalLineTo(y = 8.3f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.39f, dx2 = -0.36f, dy2 = -2.75f, dx3 = -2.75f, dy3 = -2.75f)
                horizontalLineToRelative(dx = -2.1f)
                curveToRelative(dx1 = -0.99f, dy1 = 0.0f, dx2 = -1.35f, dy2 = -0.37f, dx3 = -1.71f, dy3 = -0.85f)
                lineToRelative(dx = -1.06f, dy = -1.41f)
                curveToRelative(dx1 = -0.35f, dy1 = -0.47f, dx2 = -0.4f, dy2 = -0.54f, dx3 = -1.08f, dy3 = -0.54f)
                close()
            }
        }.build().also { _folderConnection = it }
    }

@Suppress("ObjectPropertyName")
private var _folderConnection: ImageVector? = null
